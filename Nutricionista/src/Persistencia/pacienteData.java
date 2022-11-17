package Persistencia;

import Entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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

    public void guardarPaciente(Paciente pa) {
        //INSERT INTO `paciente`(`idPaciente`, `dni`, `apellido`, `nombre`, `domicilio`, `telefono`, `altura`, `pesoActual`, `fechaNacimiento`) 
        //VALUES (?,?,?,?,?,?,?,?,?)
        try {
            String sql = "INSERT INTO `paciente`( `dni`, `apellido`, `nombre`, `domicilio`, `telefono`, `altura`, `pesoActual`, `fechaNacimiento`, `estado`) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, pa.getDni());
            ps.setString(2, pa.getApellido());
            ps.setString(3, pa.getNombre());
            ps.setString(4, pa.getDomicilio());
            ps.setInt(5, pa.getTelefono());
            ps.setDouble(6, pa.getAltura());
            ps.setDouble(7, pa.getPesoActual());
            ps.setDate(8, java.sql.Date.valueOf(pa.getFechaNacimiento()));
            ps.setBoolean(9 , true);
            ps.close();
            int registro = ps.executeUpdate();

            String cartel;
            if (registro > 0) {
                cartel = "Paciente agregado";
            } else {
                cartel = "No se pudo agregar el paciente";
            }
            JOptionPane.showMessageDialog(null, cartel);
        } catch (SQLException ex) {

            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El paciente ingresado ya existe");
            } else {
                JOptionPane.showMessageDialog(null, "Error en sentencia ");
            }

        }
    }

}
