/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class comidaData {
    private Connection cx;

    public comidaData(Connection cx) {
        this.cx = cx;
    }
    public void agregarComida(Comida com){
        try {
           String sql = "INSERT INTO `comida` (`nombre`, `detalle`, `calorias`, `estado`) VALUES (?,?,?,?)";
           PreparedStatement ps = cx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           ps.setString (1, com.getNombre());
           ps.setString (2, com.getDetalle());
           ps.setInt (3, com.getCalorias());
           ps.setBoolean (4, true);
           ps.close();    
           int registro = ps.executeUpdate();
           String mensaje;
           if (registro>0){
               mensaje = "Se agrego la comida";
           } else {
               mensaje = "No se pudo agregar la comida"; 
           }
           JOptionPane.showMessageDialog(null, mensaje);
        } catch (SQLException ex){
            if (ex.getErrorCode() == 1062 ){
               JOptionPane.showMessageDialog(null, "La comida fue agregada con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error de codigo");
            }
        }
    }
    
    
}
