package UT5.ejercicios.Listas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TaskList lista = new TaskList();
        lista.addTask("tarea");
        lista.addTask("tarea1");
        lista.addTask("tarea2");
        lista.addTask("tarea3");
        lista.addTask("tarea4");
        lista.addTask("tarea5");
        lista.addTask("tarea6");
        lista.addTask("tarea7");
        lista.addTask("tarea8");
        lista.removeTask("tarea");
        lista.completeTask("tarea5");
        lista.completeTask("tarea6");
        lista.completeTask("tarea7");

        String [] Array = lista.getTasks();
        for (int i = 0; i < Array.length; i++) {
            System.out.printf("%d. %s\n", i + 1, Array[i]);
        }
    }

}
