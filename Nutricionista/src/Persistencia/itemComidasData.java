/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.Paciente;
import Entidades.itemComidas;
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

    public void altaComidaaDieta(Dieta d, Comida c) {
        try {
            //String sql = "INSERT INTO itemcomidas(id_dieta, id_comida) VALUES (?,?)";
            String sql = "INSERT INTO itemcomidas(id_dieta, id_comida) VALUES (?,?)";
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

            if (rs.next()) {
                int clave = rs.getInt(1);
                d.setId_Dieta(clave);
            }

            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    public void bajaComidaaDieta(int id_item) {
        try {
            String sql = "DELETE FROM itemcomidas WHERE id_itemcomida=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id_item);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se quitó la comida de la dieta");
            } else {
                JOptionPane.showMessageDialog(null, "La comida no existe cargada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en sentencia");
        }

    }

    /*
    public ArrayList <Comida> obtenerComidasporDieta(int iddieta){
        ArrayList <Comida> listaComida = new ArrayList();
        Comida com;
        try {
            String sql = "SELECT * FROM itemcomidas, comida WHERE itemcomidas.id_comida= COMIDA.id_comida and itemcomidas.id_dieta=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, iddieta);
            ResultSet rs= ps.executeQuery();
            System.out.println(rs.wasNull());
            while (rs.next()) {
              com=new Comida();
              com.setId_comida(rs.getInt("id_comida"));
              com.setNombre(rs.getString("nombre"));
              com.setDetalle(rs.getString("detalle"));
              com.setCalorias(rs.getInt("calorias"));
              com.setEstado(rs.getBoolean("estado"));
              listaComida.add(com);
            }
         ps.close();
        } catch (SQLException ex) {
            
                JOptionPane.showMessageDialog(null, "Eeeerror en sentencia ");
        }
        return listaComida;
    }
   
     */
    public ArrayList<itemComidas> obtenerComidasporDietaId(int iddieta) {
        ArrayList<itemComidas> listaComida = new ArrayList();

        itemComidas com;
        Comida c;

        try {
            String sql = "SELECT * FROM itemcomidas, comida WHERE itemcomidas.id_comida= COMIDA.id_comida and itemcomidas.id_dieta=?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, iddieta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                com = new itemComidas();
                c= new Comida();
                com.setId_itemcomida(rs.getInt("id_itemcomida"));
                c.setId_comida(rs.getInt("id_comida"));
                c.setNombre(rs.getString("nombre"));
                c.setDetalle(rs.getString("detalle"));
                c.setCalorias(rs.getInt("calorias"));
                c.setEstado(rs.getBoolean("estado"));
                com.setComida(c);
                listaComida.add(com);
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error en sentencia ");
        }
        return listaComida;
    }

}
