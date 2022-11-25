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
public class itemComidasData {

    private Connection cx;

    public itemComidasData() {
        this.cx = Conexion.getConexion();

    }

    void agregaComidaaDieta(Dieta d, Comida c) {
        try {
            String sql = "INSERT INTO `itemcomidas`( 'id_dieta, 'id_comida') VALUES (?,?)";
            PreparedStatement ps = cx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, d.getId_Dieta());
            ps.setInt(2, c.getId_comida());
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

            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    void quitarComidaaDieta(Dieta d, Comida c) {
        try {
            String sql = "DELETE FROM `itemcomidas` WHERE id_dieta=? and id_comida=? ";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, d.getId_Dieta());
            ps.setInt(2, c.getId_comida());
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "La comida fue quitada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en sentencia");
        }

    }
}
