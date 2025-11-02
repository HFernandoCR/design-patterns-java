package org.example.builder.after;

public class MainAfter {
    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar Builder ---");

        // 1. Conexión simple (usa valores por defecto)
        // Mucho más legible. Solo especificamos lo obligatorio.
        ConexionBD conSimple = new ConexionBD.Builder("localhost", "db_main").construir();
        conSimple.conectar();


        // 2. Conexión avanzada (configurando opcionales)
        // El orden no importa y los métodos son descriptivos.
        ConexionBD conAvanzada = new ConexionBD.Builder("prod.server.com", "db_prod")
                .conPuerto(5432) // Método descriptivo
                .conCredenciales("admin_prod", "pass123!") // Agrupa parámetros
                .usarSSL(true) // Descriptivo
                .conTimeout(10000)
                .construir(); // Construye el objeto al final

        conAvanzada.conectar();

        System.out.println("------------------------------------------");
    }
}