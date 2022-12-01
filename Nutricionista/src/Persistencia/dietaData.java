/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sistema
 */
public class dietaData {

    private Connection cx;
    Dieta di;
    pacienteData pa;

    public dietaData() {
        this.cx = Conexion.getConexion();
        Dieta di;

    }

    public void altaDieta(Dieta di) {
        try {
            String sql = "INSERT INTO `dieta`( `id_paciente`, `iniciodieta`, `findieta`,`pesoBuscado`, `limiteCalorico`, `pesoInicial`) VALUES (?,?,?,?,?,?)";

            PreparedStatement ps = cx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, di.getPaciente().getId_paciente());
            ps.setDate(2, java.sql.Date.valueOf(di.getInicioDieta()));
            ps.setDate(3, java.sql.Date.valueOf(di.getFinDieta()));
            ps.setDouble(4, di.getPesoBuscado());
            ps.setInt(5, di.getLimiteCalorico());
            ps.setDouble(6, di.getPesoInicial());
            int registro = ps.executeUpdate();
            if (registro > 0) {
                JOptionPane.showMessageDialog(null, "La dieta se ha dado de alta - Recuerde consignar las comidas");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido crear la dieta - Verifique");
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int clave = rs.getInt(1);
                di.setId_Dieta(clave);
            }
    
            ps.close();

        } catch (SQLException ex) {

            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Dieta ya existe");
            } else {
                JOptionPane.showMessageDialog(null, "Error en sentencia ");

            }

        }
    }

    public void bajaDieta(int id_d) {
        try {
            String sql = "DELETE FROM dieta WHERE id_dieta=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id_d);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se eliminó la dieta seleccionada");
            } else {
                JOptionPane.showMessageDialog(null, "La dieta no Existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error-sentencia");
        }

    }

    public void modificaDieta(Dieta d) {
        try {
            String sql = " UPDATE `dieta` SET `id_paciente`=?,`iniciodieta`=?,`findieta`=?,`pesoBuscado`=?,`limiteCalorico`=?,`pesoInicial`=? WHERE id_dieta=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, d.getPaciente().getId_paciente());
            ps.setDate(2, java.sql.Date.valueOf(d.getInicioDieta()));
            ps.setDate(3, java.sql.Date.valueOf(d.getFinDieta()));
            ps.setDouble(4, d.getPesoBuscado());
            ps.setInt(5, d.getLimiteCalorico());
            ps.setDouble(6, d.getPesoInicial());
            ps.setInt(7, d.getId_Dieta());
            int bandera = ps.executeUpdate();
            if (bandera > 0) {
                JOptionPane.showMessageDialog(null, "Datos Dieta Actualizados ");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE HA PODIDO ACTUALIZAR LOS DATOS");
            }
            ps.close();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "La dieta ya se encuentra actualizada con esos datos - verifique");
            } else {
                if (ex.getErrorCode() == 1452) {
                    JOptionPane.showMessageDialog(null, "Dieta Inexistente");

                } else {
                    JOptionPane.showMessageDialog(null, "Error en sentencia ");
                }
            }

        }

    }

    public Dieta buscarDieta(int id_d) {
        di = new Dieta();
        pa = new pacienteData();
        try {
            String sql = "select * from dieta where id_dieta=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id_d);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                di.setId_Dieta(id_d);
                di.setPaciente(pa.buscarPaciente(rs.getInt("id_paciente")));
                di.setInicioDieta(rs.getDate("iniciodieta").toLocalDate());
                di.setFinDieta(rs.getDate("findieta").toLocalDate());
                di.setPesoBuscado(rs.getDouble("pesoBuscado"));
                di.setLimiteCalorico(rs.getInt("limiteCalorico"));
                di.setPesoInicial(rs.getDouble("pesoinicial"));
            } else {
                JOptionPane.showMessageDialog(null, "Registro no encontrado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en sentencia");
        }
        return di;
        
    }


public ArrayList <Dieta> buscarDietasxPaciente(Paciente pas) {
        di = new Dieta();
        ArrayList <Dieta> listado = new ArrayList();
        pa = new pacienteData();
        try {
            String sql = "select * from dieta where id_paciente=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, pas.getId_paciente());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                di.setId_Dieta(rs.getInt("id_dieta"));
                di.setPaciente(pa.buscarPaciente(rs.getInt("id_paciente")));
                di.setInicioDieta(rs.getDate("iniciodieta").toLocalDate());
                di.setFinDieta(rs.getDate("findieta").toLocalDate());
                di.setPesoBuscado(rs.getDouble("pesoBuscado"));
                di.setLimiteCalorico(rs.getInt("limiteCalorico"));
                di.setPesoInicial(rs.getDouble("pesoinicial"));
            listado.add(di);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en sentencia");
        }
        return listado;
        
    }
}

