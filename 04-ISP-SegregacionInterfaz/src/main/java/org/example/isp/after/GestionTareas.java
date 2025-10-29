package org.example.isp.after;

/**
 * Clase Cliente.
 * Ahora puede depender de interfaces más específicas.
 */
public class GestionTareas {

    // Este método solo necesita que el trabajador sea 'Trabajable'
    public void ejecutarTareaTrabajo(Trabajable trabajador) {
        System.out.println("\nEjecutando tarea de trabajo para: " + trabajador.getClass().getSimpleName());
        trabajador.trabajar();
    }

    // Este método necesita que el trabajador sea 'Comible'
    public void gestionarComida(Comible trabajadorQueCome) {
        System.out.println("Gestionando comida para: " + trabajadorQueCome.getClass().getSimpleName());
        trabajadorQueCome.comer();
    }
    // Este método necesita que el trabajador sea 'Descansable'
    public void gestionarDescanso(Descansable trabajadorQueDescansa) {
        System.out.println("Gestionando descanso para: " + trabajadorQueDescansa.getClass().getSimpleName());
        trabajadorQueDescansa.descansar();
    }
}