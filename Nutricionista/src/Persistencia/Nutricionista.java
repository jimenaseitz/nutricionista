/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.Paciente;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * ....
 *
 * @author jimes
 */
public class Nutricionista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        dietaData condieta = new dietaData();
        Dieta di = new Dieta();

        pacienteData conpas = new pacienteData();
        Paciente pas = new Paciente();
        pas = conpas.buscarPaciente(26912333);
        pas.setId_paciente(9);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate inputAdDate = LocalDate.parse("2020-12-12", formatter);
        di.setInicioDieta(inputAdDate);
        inputAdDate = LocalDate.parse("2020-12-30", formatter).plusDays(7);
        di.setFinDieta(inputAdDate);
        di.setPaciente(pas);
 di.setId_Dieta(15);
        //  System.out.println(di);
        //System.out.println(di.getId_Dieta());
        
        //creo dieta
        condieta.altaDieta(di);
condieta.bajaDieta(12);
        
    Comida com= new Comida();
    com.setId_comida(18);
    
    
    
    
    itemComidasData item= new itemComidasData();
item.altaComidaaDieta(di, com);
item.bajaComidaaDieta(37);

    
    
    
    
    }

}
