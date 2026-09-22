/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebadevops;

import java.util.ArrayList;

/**
 *
 * @author daw2
 */
public class GestorTareas {

    private ArrayList<Tarea> tareas;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }

    public boolean generarTarea(Tarea e){
        return tareas.add(e);
    }
    
    public void marcarCompletada(Tarea e){
        e.setCompletada();
    }
    
    public void listarTareas(){
        for(Tarea t:tareas){
            System.out.println(t.toString());
        }
    }
    
    public void eliminarCompletas(){
        for(Tarea t:tareas){
            if (t.isCompletada()) {
                tareas.remove(t);
            }
        }
    }
}
