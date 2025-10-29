package org.example.lsp.before;

import java.util.Map;

public class MainBefore {

    // Este método espera CUALQUIER ConfigLoader y asume que puede usar loadConfig(path)
    public static void procesarConfiguracion(ConfigLoader loader, String path) {
        System.out.println("\nProcesando con: " + loader.getClass().getSimpleName());
        try {
            // Se asume que SIEMPRE se puede llamar así según el contrato de ConfigLoader
            Map<String, String> config = loader.loadConfig(path);

            if (config.isEmpty()) {
                System.out.println("Advertencia: Configuración vacía o no cargada.");
            } else {
                System.out.println("Configuración obtenida:");
                config.forEach((key, value) -> System.out.println("  " + key + ": " + value));
            }
        } catch (Exception e) {
            System.err.println("Error procesando configuración: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar LSP ---");

        ConfigLoader fileLoader = new FileConfigLoader();
        ConfigLoader encryptedLoaderMalo = new EncryptedConfigLoaderMalo();

        // Funciona bien con FileConfigLoader
        procesarConfiguracion(fileLoader, "/etc/app.conf");

        // NO funciona como se espera con EncryptedConfigLoaderMalo
        // Imprime error o devuelve vacío porque el método base no recibe la contraseña.
        // La subclase no puede sustituir a la superclase sin problemas.
        procesarConfiguracion(encryptedLoaderMalo, "/secure/api.enc");

        // Para usar EncryptedConfigLoaderMalo "correctamente", el cliente
        // necesita saber que ES un EncryptedConfigLoaderMalo y llamar al método específico.
        // Esto rompe la abstracción.
        System.out.println("\nLlamada específica (rompe LSP):");
        if (encryptedLoaderMalo instanceof EncryptedConfigLoaderMalo) {
            Map<String, String> config = ((EncryptedConfigLoaderMalo) encryptedLoaderMalo).loadConfig("/secure/api.enc", "secreto123");
            System.out.println("Configuración cifrada obtenida (vía casting):");
            config.forEach((key, value) -> System.out.println("  " + key + ": " + value));
        }

        System.out.println("---------------------------------------");
    }
}