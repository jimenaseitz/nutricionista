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

    void guardarDieta(Dieta di) {
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

    void agregaComidasaDieta(int id_dieta, Comida comida) {
        //metodo buscacomida
        
        try {
            String sql = "INSERT INTO `itemcomidas`( 'id_dietau', 'id_comida') VALUES (?,?)";
            PreparedStatement ps = cx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id_dieta);
            ps.setInt(2, comida.getId_comida());
            int registro = ps.executeUpdate();
            if (registro > 0) {
                JOptionPane.showMessageDialog(null, "Se agregó la Comida");
            } else {
                JOptionPane.showMessageDialog(null, "la Comida no se ha agregado");
            }
            ResultSet rs = ps.getGeneratedKeys();
            /*
            if (rs.next()) {
                int clave = rs.getInt(1);
                di.setId_Dieta(clave);
            }
             */
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error en sentencia ");
        }

    }

}
