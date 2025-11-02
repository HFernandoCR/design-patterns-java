package org.example.singleton.after;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * SOLUCIÓN: Singleton para el Gestor de Logs.
 * Garantiza un único punto de registro cronológico para toda la app.
 */
public class GestorLogs {

    // 1. La única instancia (volátil y final)
    private static volatile GestorLogs instancia;

    // Almacén de logs unificado
    private final List<String> logs = new ArrayList<>();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    // 2. Constructor PRIVADO
    private GestorLogs() {
        if (instancia != null) {
            throw new IllegalStateException("¡Use getInstancia()!");
        }
        System.out.println("Creando GestorLogs UNIFICADO... (UNA SOLA VEZ)");
    }

    // 3. Método de acceso global (Thread-Safe con Double-Checked Locking)
    public static GestorLogs getInstancia() {
        if (instancia == null) {
            synchronized (GestorLogs.class) {
                if (instancia == null) {
                    instancia = new GestorLogs();
                }
            }
        }
        return instancia;
    }

    // --- Métodos de negocio ---

    /**
     * Anota un evento en el log unificado.
     * @param modulo El nombre del módulo/clase que registra (ej. "ControladorWeb")
     * @param nivel El nivel (ej. "INFO", "ERROR")
     * @param mensaje El mensaje a registrar
     */
    public void anotar(String modulo, String nivel, String mensaje) {
        String timestamp = LocalDateTime.now().format(formatter);
        String entrada = timestamp + " [" + nivel + "] [" + modulo + "] " + mensaje;

        // Sincronizamos la escritura a la lista para seguridad en hilos
        synchronized (logs) {
            logs.add(entrada);
        }
    }

    /**
     * Imprime todos los logs registrados en la aplicación.
     */
    public void imprimirLogUnificado() {
        System.out.println("--- LOG UNIFICADO DE APLICACIÓN ---");
        // No necesitamos sincronizar la lectura si solo estamos iterando
        for (String log : logs) {
            System.out.println(log);
        }
        System.out.println("-----------------------------------");
    }
}