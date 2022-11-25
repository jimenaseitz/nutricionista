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

    public dietaData() {
        this.cx = Conexion.getConexion();

    }

    void altaDieta(Dieta di) {
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
            System.out.println(di);
            System.out.println(di.getId_Dieta());
            ps.close();

        } catch (SQLException ex) {

            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Dieta ya existe");
            } else {
                JOptionPane.showMessageDialog(null, "Error en sentencia ");

            }

        }
    }
    void bajaDieta(int id_d){
        try {
            String sql = "DELETE FROM dieta WHERE id_dieta=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id_d);
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se eliminó la dieta seleccionada");
            }
            else {
                JOptionPane.showMessageDialog(null, "La dieta no Existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error-sentencia");
        }

    }
        
    }

   


    
