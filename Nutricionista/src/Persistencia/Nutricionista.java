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
import Vistas.FrPrincipal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * ....
 *
 * @author Lp
 */
public class Nutricionista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*
        dietaData condieta = new dietaData();
        Dieta di = new Dieta();
        ArrayList <Paciente> pacientes = new ArrayList();

        pacienteData conpas = new pacienteData();
        Paciente pas = new Paciente();
        pas = conpas.buscarPacientexDNI(30845411);
        System.out.println("Busca un paciente por DNI:");
        System.out.println(pas);
        pas.setId_paciente(9);
        System.out.println("----------------------------------------");
        System.out.println("Busca paciente por Kilo: ");
        pacientes = conpas.buscarxkilo(10);
        System.out.println(pacientes);
        System.out.println("----------------------------------------");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate inputAdDate = LocalDate.parse("2020-12-12", formatter);
        
        inputAdDate = LocalDate.parse("2020-12-30", formatter).plusDays(7);
        di.setFinDieta(inputAdDate);
        di.setPaciente(pas);
        di.setId_Dieta(15);
        System.out.println(di);
        //System.out.println(di.getId_Dieta());

        //creo dieta
        condieta.altaDieta(di);
        condieta.bajaDieta(12);

        Comida com = new Comida();
        com.setId_comida(18);

        // alta -baja comida / 
        itemComidasData item = new itemComidasData();
        item.altaComidaaDieta(di, com);
        item.bajaComidaaDieta(37);
        System.out.println(item.obtenerComidasporDieta(16));
        System.out.println("---------------");

        dietaData d = new dietaData();
        int id;
        id = 15;
        System.out.println(d.buscarDieta(id));

        comidaData comdata = new comidaData();
        Comida c = new Comida();
        c.setId_comida(23);
        c.setNombre("zza");
        c.setDetalle("Queso y panceta");
        c.setCalorias(80);
        c.setEstado(true);
        comdata.altaComida(c);
        System.out.println(comdata.buscarComida(18));
        comdata.bajaComida(23);
        comdata.actualizarComida(c);
        comdata.buscarComida(18);
        System.out.println("---------------muestra dietas seleccionadas");
        pas = new Paciente();
        pas.setId_paciente(19);
        System.out.println(condieta.buscarDietasxPaciente(pas));
        System.out.println(item.obtenerComidasporDieta(19));

   itemComidasData itemcom= new itemComidasData();
        System.out.println(itemcom.obtenerComidasporDietaId(19));     
*/
  FrPrincipal princ = new FrPrincipal();
        princ.setVisible(true);
    }

}
