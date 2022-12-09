/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
// BUSCAR COMIDA POR ID

public class comidaData {
    private Connection cx;

    public comidaData() {
        this.cx = Conexion.getConexion();
        
    }
    public void altaComida(Comida com){
        try {
           String sql = "INSERT INTO comida (nombre, detalle, calorias, estado) VALUES (?,?,?,?)";
           PreparedStatement ps = cx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           ps.setString (1, com.getNombre());
           ps.setString (2, com.getDetalle());
           ps.setInt (3, com.getCalorias());
           ps.setBoolean (4, true);
           int registro = ps.executeUpdate();
           String mensaje;
           if (registro>0){
               mensaje = "Se agrego la comida";
           } else {
               mensaje = "No se pudo agregar la comida"; 
           }
           JOptionPane.showMessageDialog(null, mensaje);
           ps.close(); 
        } catch (SQLException ex){
            if (ex.getErrorCode() == 1062 ){
               JOptionPane.showMessageDialog(null, "La comida fue agregada con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error de codigo");
            }
        }
    }
    
    public void actualizarComida(Comida com){
        String query = "UPDATE comida set nombre=?, detalle=?, calorias=? where id_comida=?) ";
        try{
            PreparedStatement ps = cx.prepareStatement(query);
            ps.setString(1,com.getNombre());
            ps.setString(2,com.getDetalle());
            ps.setInt(3,com.getCalorias());
       
            if (ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Los datos fueron actualizados");
            } else {
                JOptionPane.showMessageDialog(null, "La comida que desea modificar no existe ");
            }
            ps.close();
        }catch (SQLException ex){
            if(ex.getErrorCode()== 1062){
              JOptionPane.showMessageDialog(null, "los datos de la comida ya se encuentran ingresados ");  
            }else if (ex.getErrorCode() == 1452) {
                JOptionPane.showMessageDialog(null, "La comida es inexistente - verifique");

            } else {
                JOptionPane.showMessageDialog(null, "Error en sentencia ");
            }
            
        }
    }
    public void bajaComida(int id) {//borrado logico
        String sql = "UPDATE comida SET estado=false where id_comida=?";
        PreparedStatement ps;
        try {
            ps = cx.prepareStatement(sql);

            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "LA COMIDA FUE BORRADA");

            } else {
                JOptionPane.showMessageDialog(null, "No fue posible actualizar");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error en sentencia verifique sqlBORRARCOMIDA");
        }

    }

    public Comida buscarComida (int id){
        Comida com = new Comida();
        String sql = "SELECT * FROM comida WHERE id_comida = ? and estado = true";
        try {
        PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                com = new Comida();
                com.setNombre(rs.getString("nombre"));
                com.setDetalle(rs.getString("detalle")); 
                com.setCalorias(rs.getInt("calorias"));          
               
            } else {
                JOptionPane.showMessageDialog(null, "Paciente no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema en 'BuscarPaciente'");
        }
        return com;
    }
    public ArrayList<Comida> buscaComidasActivas() {
        ArrayList<Comida> aux = new ArrayList();
        Comida com;
        String sql = "Select * from comida where estado=1 ORDER BY nombre ASC";
        try {
            PreparedStatement ps = cx.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                com = new Comida();
                com.setId_comida(rs.getInt("id_comida"));
                com.setNombre(rs.getString("nombre"));
                com.setDetalle(rs.getString("detalle"));
                com.setCalorias(rs.getInt("calorias"));
                aux.add(com);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lista O consulta incorrecta, verifique");
        }
        return aux;

    }
     public ArrayList<Comida> buscaComidasPorCalorias(int calorias) {
        ArrayList<Comida> aux = new ArrayList();
        Comida com;
        String sql = "Select * from comida where calorias < ? and estado=1 ORDER BY nombre ASC";
        
        try {
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, calorias);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                com = new Comida();
                com.setId_comida(rs.getInt("id_comida"));
                com.setNombre(rs.getString("nombre"));
                com.setDetalle(rs.getString("detalle"));
                com.setCalorias(rs.getInt("calorias"));
                aux.add(com);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lista O consulta incorrecta, verifique");
        }
        return aux;

    }
    }

