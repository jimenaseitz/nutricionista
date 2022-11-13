/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author jimes
 */
public class Comidas {
    private int idComida;
    private String nombre;
    private String detalle;
    private int Calorias;

    public Comidas() {
    }

    public Comidas(int idComida, String nombre, String detalle, int Calorias) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.detalle = detalle;
        this.Calorias = Calorias;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCalorias() {
        return Calorias;
    }

    public void setCalorias(int Calorias) {
        this.Calorias = Calorias;
    }
    
    
}
