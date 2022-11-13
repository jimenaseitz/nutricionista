/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author jimes
 */
public class Dieta {
    private int idDieta;
    private int idPaciente;
    private LocalDate inicioDieta;
    private LocalDate finDieta;
    private double pesoBuscado;
    private int limiteCalorico;
    private double pesoInicial;

    public Dieta() {
    }

    public Dieta(int idDieta, int idPaciente, LocalDate inicioDieta, LocalDate finDieta, double pesoBuscado, int limiteCalorico, double pesoInicial) {
        this.idDieta = idDieta;
        this.idPaciente = idPaciente;
        this.inicioDieta = inicioDieta;
        this.finDieta = finDieta;
        this.pesoBuscado = pesoBuscado;
        this.limiteCalorico = limiteCalorico;
        this.pesoInicial = pesoInicial;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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
        return "Dieta{" + "idDieta=" + idDieta + ", idPaciente=" + idPaciente + ", inicioDieta=" + inicioDieta + ", finDieta=" + finDieta + '}';
    }
    
    
    
}
