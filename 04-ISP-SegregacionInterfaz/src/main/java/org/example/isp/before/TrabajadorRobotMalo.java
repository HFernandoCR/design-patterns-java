package org.example.isp.before;

// ¡PROBLEMA! Esta clase es forzada a implementar comer() y descansar()
// aunque un robot no coma ni descanse de la misma manera.
public class TrabajadorRobotMalo implements Trabajador {
    @Override
    public void trabajar() {
        System.out.println("Robot trabajando (procesando datos)...");
    }

    @Override
    public void comer() {
        // ¿Qué hacemos aquí? Dejarlo vacío viola las expectativas.
        // Lanzar excepción es una opción, pero obliga al cliente a manejarla.
        // System.out.println("Robot 'comiendo' (recargando batería)..."); // ¿Es lo mismo?
        throw new UnsupportedOperationException("Los robots no comen");
    }

    @Override
    public void descansar() {
        // Similar a comer()
        // System.out.println("Robot 'descansando' (en modo stand-by)...");
        throw new UnsupportedOperationException("Los robots no descansan");
    }
}