/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author sistema
 */
public class itemComidas {
    private Paciente paciente;
    private Comida comida;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    @Override
    public String toString() {
        return "itemComidas{" + "paciente=" + paciente + ", comida=" + comida + '}';
    }
    
    
    
}
