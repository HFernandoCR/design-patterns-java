package org.example.singleton.before;

public class MainBefore {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES (Logs) ---");

        // El Controlador Web tiene su propio logger
        System.out.println("\n(Acción 1: Petición Web)");
        GestorLogsMalo logControlador = new GestorLogsMalo("ControladorWeb");
        logControlador.anotar("INFO", "Petición /api/usuarios recibida");

        // El Servicio de Usuarios tiene OTRO logger
        System.out.println("\n(Acción 2: Lógica de Negocio)");
        GestorLogsMalo logServicio = new GestorLogsMalo("ServicioUsuarios");
        logServicio.anotar("INFO", "Validando datos del usuario...");
        logServicio.anotar("ERROR", "Conexión a BD fallida");

        // Al final del día, los logs están separados y no podemos ver la traza completa
        System.out.println("\n--- Logs al final ---");
        logControlador.imprimirLog(); // Solo tiene la entrada del controlador
        logServicio.imprimirLog();    // Solo tiene las entradas del servicio

        System.out.println("-------------------------");
    }
}