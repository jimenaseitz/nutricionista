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
public class Comida {
    private int id_comida;
    private String nombre;
    private String detalle;
    private int Calorias;
    private boolean estado;

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Comida() {
    }

    public Comida(int id_comida, String nombre, String detalle, int Calorias) {
        this.id_comida = id_comida;
        this.nombre = nombre;
        this.detalle = detalle;
        this.Calorias = Calorias;
    }

    public int getId_comida() {
        return id_comida;
    }

    public void setId_comida(int id_comida) {
        this.id_comida = id_comida;
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

    @Override
    public String toString() {
        return "Comidas{" + "idComida=" + id_comida + ", nombre=" + nombre + ", detalle=" + detalle + ", Calorias=" + Calorias + ", estado=" + estado + '}';
    }
    
    
}
