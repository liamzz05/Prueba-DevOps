/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebadevops;

/**
 *
 * @author daw2
 */
public class Tarea {
    private String descripción;
    private boolean completada;

    public Tarea(String descripción) {
        this.descripción = descripción;
        this.completada = false;
    }

    public String getDescripción() {
        return descripción;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public void setCompletada() {
        this.completada = true;
    }

    @Override
    public String toString() {
        String resultado;
        if (completada) {
            resultado="Tarea: " + descripción + " Completa.";
        } else{
            resultado="Tarea: " + descripción + " No completa.";
        }
        
        return resultado;
    }

   
}
