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

    public dietaData(Connection cx) {
        this.cx = cx;

    }

void altaDieta(Dieta di){
        try {
            String sql = "//INSERT INTO `dieta`( `id_paciente`, `iniciodieta`, `findieta`,"
                    + " `pesoBuscado`, `limiteCalorico`, `pesoInicial`) VALUES (?,?,?,?,?,?)" ;
            PreparedStatement ps = cx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, di.getPaciente().getId_paciente());
            ps.setDate(2, java.sql.Date.valueOf(di.getInicioDieta()));
            ps.setDate(3, java.sql.Date.valueOf(di.getFinDieta()));
            ps.setDouble(4, di.getPesoBuscado());
            ps.setInt(5, di.getLimiteCalorico());
            ps.setDouble(6, di.getPesoInicial());
    
                    
            ps.setBoolean(9, true);
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

    
    
    
void agregarComidasaDieta(Dieta dieta, ArrayList comida){

    
}
}


