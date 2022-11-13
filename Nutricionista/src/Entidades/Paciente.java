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
public class Paciente {
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private int idPaciente;
    private LocalDate fechaNacimiento;
    private int telefono;
    private double pesoActual;
    private double altura;

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, int dni, String domicilio, int idPaciente, LocalDate fechaNacimiento, int telefono, double pesoActual, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.idPaciente = idPaciente;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.pesoActual = pesoActual;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Paciente\n" + "nombre= " + nombre + "\n apellido= " + apellido + "\n dni= " + dni +"\n idPaciente= " + idPaciente ;
    }
    
    }
