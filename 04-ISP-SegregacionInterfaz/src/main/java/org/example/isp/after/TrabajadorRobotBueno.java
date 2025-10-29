package org.example.isp.after;

// Implementa SOLO la interfaz que necesita (Trabajable).
// No es forzado a tener métodos irrelevantes.
public class TrabajadorRobotBueno implements Trabajable {
    @Override
    public void trabajar() {
        System.out.println("Robot trabajando (procesando datos)...");
    }
    // No necesita implementar comer() ni descansar()
}