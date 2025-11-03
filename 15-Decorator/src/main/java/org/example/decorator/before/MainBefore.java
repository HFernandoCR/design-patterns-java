package org.example.decorator.before;

public class MainBefore {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar Decorator ---");

        // Queremos un archivo simple
        DataSourceMalo simple = new DataSourceMalo("archivo.dat", false, false);
        simple.escribirDatos("Hola");

        System.out.println("---");

        // Queremos un archivo comprimido y encriptado
        // ¡El orden importa! Aquí se comprime y LUEGO se encripta el comprimido.
        DataSourceMalo completo = new DataSourceMalo("seguro.dat", true, true);
        completo.escribirDatos("Datos sensibles");

        // ¿Qué pasa si queremos encriptar y LUEGO comprimir?
        // No podemos con esta clase, la lógica es fija (primero encripta, luego comprime).
        // Tendríamos que añadir otro 'if' o cambiar el orden.

        System.out.println("--------------------------------------------");
    }
}