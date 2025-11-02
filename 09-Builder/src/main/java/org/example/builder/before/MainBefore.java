package org.example.builder.before;

public class MainBefore {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar Builder ---");

        // 1. Conexión simple (valores por defecto)
        // Qué feo. Tengo que saber todos los valores por defecto y pasarlos.
        ConexionBDMala conSimple = new ConexionBDMala(
                "localhost", 3306, "db_main", "root", "", false, 5000
        );

        // 2. Conexión avanzada.
        // Fácil de equivocar: ¿Qué pasa si pongo 10000 (timeout) donde va 5432 (puerto)?
        ConexionBDMala conAvanzada = new ConexionBDMala(
                "prod.server.com", 5432, "db_prod", "admin_prod", "pass123!", true, 10000
        );

        System.out.println("------------------------------------------");
    }
}