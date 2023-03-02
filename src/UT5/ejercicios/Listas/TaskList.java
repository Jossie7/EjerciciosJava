package UT5.ejercicios.Listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskList {
        private List<String> tasks;

    public TaskList() {
            tasks = new ArrayList<>(); // por defecto se utiliza ArrayList
        }

    public TaskList(String type) {
            if ("arraylist".equalsIgnoreCase(type)) {
                tasks = new ArrayList<>();
            } else if ("linkedlist".equalsIgnoreCase(type)) {
                tasks = new LinkedList<>();
            }
        }

        // addTask(String task): Agrega una nueva tarea a la lista. Eso quiere decir que task representa la tarea que vamos a añadir.
        public void addTask(String task){
        tasks.add(task);
        }
        // removeTask(String task): Elimina la tarea especificada de la lista.
        public void removeTask(String task){
        tasks.remove(task);
        }
        // completeTask(String task): Marca la tarea especificada como completada.
        // set es para cambiar valores, y se necesitará 2 parámetros los cuales son: la posición y la tarea.
        public void completeTask (String task) {
            int index = tasks.indexOf(task);
            if (index >= 0) {
                tasks.set(index, task + " (completada)");
            }
        }

        // getTasks(): Devuelve un arreglo con todas las tareas de la lista.
        public String [] getTasks(){
        return tasks.toArray(new String[0]);
        }
}

