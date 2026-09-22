/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebadevops;

import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class PruebaDevops {

    public static void main(String[] args) {
        boolean salir=false;
        GestorTareas g= new GestorTareas();
        
        do{
            System.out.println("Gestor de tareas. Seleccione una opcion:"
                    + "\n1. Registrar tarea\n2. Ver tareas\n3. Completar tarea"
                    + "\n4. Eliminar completadas\n0. Salir");
            
            int opcion=new Scanner(System.in).nextInt();
            
            switch(opcion){
                case 0 -> salir=true;
                case 1-> {
                    System.out.println("Introduzca descripción de la tarea:");
                    String descripcion=new Scanner(System.in).nextLine();
                    Tarea tarea=new Tarea(descripcion);
                    g.generarTarea(tarea);
                }
                case 2-> g.listarTareas();
                case 3 -> {
                    System.out.println("Introduzca descripción de la tarea a completar:");
                    String descripcion=new Scanner(System.in).nextLine();
                    Tarea tarea=new Tarea(descripcion);
                    if (g.existe(tarea)) {
                        g.marcarCompletada(tarea);
                    } else{
                        System.out.println("Tarea no encontrada");
                    }
                }
                case 4 -> g.eliminarCompletas();
                default -> System.out.println("Valor no válido");
            }
        } while(!salir);
    }
}
