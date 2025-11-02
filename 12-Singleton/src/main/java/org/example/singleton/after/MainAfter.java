package org.example.singleton.after;

public class MainAfter {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n--- Ejecutando DESPUÉS (Logs) ---");

        // El Controlador Web pide la instancia
        System.out.println("\n(Acción 1: Petición Web)");
        GestorLogs logControlador = GestorLogs.getInstancia();
        logControlador.anotar("ControladorWeb", "INFO", "Petición /api/usuarios recibida");

        // Simula un pequeño retraso
        Thread.sleep(10);

        // El Servicio de Usuarios pide la MISMA instancia
        System.out.println("\n(Acción 2: Lógica de Negocio)");
        GestorLogs logServicio = GestorLogs.getInstancia();
        logServicio.anotar("ServicioUsuarios", "INFO", "Validando datos del usuario...");

        Thread.sleep(10);

        logServicio.anotar("ServicioUsuarios", "ERROR", "Conexión a BD fallida");

        // Al final del día, pedimos el log a CUALQUIERA de las variables
        // (ambas apuntan al mismo objeto) y vemos la traza completa y cronológica.
        System.out.println("\n--- Logs al final ---");
        logControlador.imprimirLogUnificado();

        System.out.println("\n¿Son la misma instancia? " + (logControlador == logServicio));
        System.out.println("-------------------------");
    }
}