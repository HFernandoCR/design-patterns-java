package org.example.adapter.after;

public class MainAfter {
    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar Adapter ---");

        // 1. Creamos el Adaptador, que "envuelve" la API incompatible
        IProcesadorDatos adaptadorCsv = new CsvAdapter();

        // 2. Inyectamos el adaptador al cliente.
        // El cliente (ProcesadorBueno) cree que está hablando con
        // un proveedor de datos JSON nativo.
        ProcesadorBueno procesador = new ProcesadorBueno(adaptadorCsv);

        procesador.procesar();

        System.out.println("------------------------------------------");
    }
}