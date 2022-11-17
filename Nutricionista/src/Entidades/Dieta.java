/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author jimes
 */
public class Dieta {
    private int id_Dieta;
    private int id_Paciente;
    private LocalDate inicioDieta;
    private LocalDate finDieta;
    private double pesoBuscado;
    private int limiteCalorico;
    private double pesoInicial;
    private ArrayList <Comida> listacom;
    

    public Dieta() {
    }

    public Dieta(int id_dieta, int id_paciente, LocalDate inicioDieta, LocalDate finDieta, double pesoBuscado, int limiteCalorico, double pesoInicial) {
        this.id_Dieta = id_dieta;
        this.id_Paciente = id_paciente;
        this.inicioDieta = inicioDieta;
        this.finDieta = finDieta;
        this.pesoBuscado = pesoBuscado;
        this.limiteCalorico = limiteCalorico;
        this.pesoInicial = pesoInicial;
    }

    public ArrayList<Comida> getListacom() {
        return listacom;
    }

    public void setListacom(ArrayList<Comida> listacom) {
        this.listacom = listacom;
    }

    public int getId_Dieta() {
        return id_Dieta;
    }

    public void setId_Dieta(int id_Dieta) {
        this.id_Dieta = id_Dieta;
    }

    public int getId_Paciente() {
        return id_Paciente;
    }

    public void setId_Paciente(int id_Paciente) {
        this.id_Paciente = id_Paciente;
    }

    public LocalDate getInicioDieta() {
        return inicioDieta;
    }

    public void setInicioDieta(LocalDate inicioDieta) {
        this.inicioDieta = inicioDieta;
    }

    public LocalDate getFinDieta() {
        return finDieta;
    }

    public void setFinDieta(LocalDate finDieta) {
        this.finDieta = finDieta;
    }

    public double getPesoBuscado() {
        return pesoBuscado;
    }

    public void setPesoBuscado(double pesoBuscado) {
        this.pesoBuscado = pesoBuscado;
    }

    public int getLimiteCalorico() {
        return limiteCalorico;
    }

    public void setLimiteCalorico(int limiteCalorico) {
        this.limiteCalorico = limiteCalorico;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    @Override
    public String toString() {
        return "Dieta{" + "id_Paciente=" + id_Paciente + ", inicioDieta=" + inicioDieta + ", finDieta=" + finDieta + ", pesoBuscado=" + pesoBuscado + ", limiteCalorico=" + limiteCalorico + ", pesoInicial=" + pesoInicial + ", listacom=" + listacom + '}';
    }

 
    
    
}
