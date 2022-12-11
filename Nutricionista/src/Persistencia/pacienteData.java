
package Persistencia;

import Entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tommy
 */
public class pacienteData {

    private Connection cx;

    public pacienteData() {
        this.cx = Conexion.getConexion();
    }

    public void altaPaciente(Paciente pa) {
        //INSERT INTO `paciente`(`idPaciente`, `dni`, `apellido`, `nombre`, `domicilio`, `telefono`, `altura`, `pesoActual`, `fechaNacimiento`) 
        //VALUES (?,?,?,?,?,?,?,?,?)
        try {
            String sql = "INSERT INTO `paciente`( `dni`, `apellido`, `nombre`, `domicilio`, `telefono`, `altura`, `pesoActual`, `fechaNacimiento`, `estado`) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pa.getDni());
            ps.setString(2, pa.getApellido());
            ps.setString(3, pa.getNombre());
            ps.setString(4, pa.getDomicilio());
            ps.setInt(5, pa.getTelefono());
            ps.setDouble(6, pa.getAltura());
            ps.setDouble(7, pa.getPesoActual());
            ps.setDate(8, java.sql.Date.valueOf(pa.getFechaNacimiento()));
            ps.setBoolean(9, true);
            
            int registro = ps.executeUpdate();
            
            String cartel;
            if (registro > 0) {
                cartel = "Paciente agregado";
            } else {
                cartel = "No se pudo agregar el paciente";
            }
            JOptionPane.showMessageDialog(null, cartel);
            ps.close();
        } catch (SQLException ex) {

            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El paciente ingresado ya existe");
            } else {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println("En ALtaPaciente el error es :" + ex.getMessage());
            }

        }
    }

    public Paciente buscarPacientexDNI(int dni) {
        Paciente pa = new Paciente();
        String sql = "SELECT * FROM `paciente` WHERE `dni` = ?";
        try {
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               pa=new Paciente(); 
                pa.setNombre(rs.getString("nombre"));
                pa.setApellido(rs.getString("apellido"));
                pa.setAltura(rs.getDouble("altura"));
                pa.setTelefono(rs.getInt("telefono"));
                pa.setId_paciente(rs.getInt("id_paciente"));
                pa.setDomicilio(rs.getString("domicilio"));
                pa.setDni(dni);
                pa.setPesoActual(rs.getDouble("pesoActual"));
                pa.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                pa.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "Paciente no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("El error en Buscar Paciente x DNI es: " + ex.getMessage() + "y esto es el SQL state: " + ex.getSQLState());
            JOptionPane.showMessageDialog(null, "Problema en 'BuscarPacientexDNI'");
        }
        return pa;
    }
    
    
    public Paciente buscarPacientexId(int id_paciente) {
        Paciente pa = new Paciente();
        String sql = "SELECT * FROM `paciente` WHERE `id_paciente` = ?";
        try {
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id_paciente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pa=new Paciente();
                pa.setNombre(rs.getString("nombre"));
                pa.setApellido(rs.getString("apellido"));
                pa.setAltura(rs.getDouble("altura"));
                pa.setTelefono(rs.getInt("telefono"));
                pa.setId_paciente(rs.getInt("id_paciente"));
                pa.setDomicilio(rs.getString("domicilio"));
                pa.setDni(rs.getInt("dni"));
                pa.setPesoActual(rs.getDouble("pesoActual"));
                pa.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                pa.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "Paciente no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema en 'BuscarPaciente x ID'");
        }
        return pa;
    }

    public void bajaPaciente(int dni) {
        String sql = "UPDATE `paciente` SET estado=false where ?";
        try {
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, dni);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "El paciente fue borrado");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo borrar el paciente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema en 'BorrarPaciente'");
        }

    }

    public void modificarPaciente(Paciente pa) {
        //UPDATE `paciente` SET `dni`='?',`apellido`='?',`nombre`='?',
        //`domicilio`='?',`telefono`='?',`altura`='?',`pesoActual`='?',`fechaNacimiento`='?' WHERE estado = 1;
        String sql = "UPDATE `paciente` SET `dni`=?,`apellido`=?,`nombre`=?,`domicilio`=?,`telefono`=?,`altura`=?,`pesoActual`=?,`fechaNacimiento`=?WHERE estado = 1;";
        try {
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setLong(1, pa.getDni());
            ps.setString(2, pa.getApellido());
            ps.setString(3, pa.getNombre());
            ps.setString(4, pa.getDomicilio());
            ps.setInt(5, pa.getTelefono());
            ps.setDouble(6, pa.getAltura());
            ps.setDouble(7, pa.getPesoActual());
            ps.setDate(8, java.sql.Date.valueOf(pa.getFechaNacimiento()));
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS");
            } else {
                JOptionPane.showMessageDialog(null, "NO EXISTE EL PACIENTE - VERIFIQUE");
            }
            ps.close();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El paciente ya tiene esos datos - verifique " + ex.getMessage());
            } else {
                if (ex.getErrorCode() == 1452) {
                    JOptionPane.showMessageDialog(null, "El paciente no existe");

                } else {
                    JOptionPane.showMessageDialog(null, "Error en sentencia " + ex.getMessage());
                }
            }
        }

    }

    public ArrayList<Paciente> buscarxkilo(int kilo) {
        //SELECT * FROM paciente, dieta WHERE paciente.id_paciente=dieta.id_paciente and (paciente.pesoActual-dieta.pesoBuscado)>x;        
        
        ArrayList<Paciente> pacientes = new ArrayList();
        String sql = "SELECT * FROM paciente, dieta WHERE paciente.id_paciente=dieta.id_paciente and (paciente.pesoActual-dieta.pesoBuscado)>? and `estado` = 1";
        try {
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, kilo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Paciente pa = new Paciente();
                pa.setNombre(rs.getString("nombre"));
                pa.setApellido(rs.getString("apellido"));
                pa.setAltura(rs.getDouble("altura"));
                pa.setTelefono(rs.getInt("telefono"));
                pa.setId_paciente(rs.getInt("id_paciente"));
                pa.setDomicilio(rs.getString("domicilio"));
                pa.setDni(rs.getInt("dni"));
                pa.setPesoActual(rs.getDouble("pesoActual"));
                pa.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                pa.setEstado(rs.getBoolean("estado"));
                pacientes.add(pa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema en 'BuscarPacientexKilo'");
        }

        return pacientes;
    }
    
    public ArrayList<Paciente> buscarpacientes() {    
        Paciente pa ;
        ArrayList<Paciente> pacientes = new ArrayList();
        String sql = "SELECT * FROM paciente WHERE `estado` = 1";
        try {
            PreparedStatement ps = cx.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pa = new Paciente();
                pa.setNombre(rs.getString("nombre"));
                pa.setApellido(rs.getString("apellido"));
                pa.setAltura(rs.getDouble("altura"));
                pa.setTelefono(rs.getInt("telefono"));
                pa.setId_paciente(rs.getInt("id_paciente"));
                pa.setDomicilio(rs.getString("domicilio"));
                pa.setDni(rs.getInt("dni"));
                pa.setPesoActual(rs.getDouble("pesoActual"));
                pa.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                pa.setEstado(rs.getBoolean("estado"));
                pacientes.add(pa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema en 'BuscarPacientes'");
        }

        return pacientes;
    }


}
