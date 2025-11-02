package org.example.adapter.before;

/**
 * Cliente (Violando DIP).
 * Está fuertemente acoplado a la implementación concreta de ApiExternaCsv.
 * Además, tiene que incluir lógica de "traducción" (parsing) de CSV.
 */
public class ProcesadorMalo {
    private ApiExternaCsv apiCsv = new ApiExternaCsv();

    public void procesar() {
        System.out.println("ProcesadorMalo: Iniciando proceso...");
        String datosCsv = apiCsv.obtenerDatosCsv();

        // Lógica de traducción (parsing) dentro del cliente
        System.out.println("ProcesadorMalo: Parseando CSV...");
        String[] lineas = datosCsv.split("\n");
        // (Saltamos la cabecera lineas[0])
        for (int i = 1; i < lineas.length; i++) {
            String[] campos = lineas[i].split(",");
            // Simulamos un formato "JSON"
            String json = "{ \"id\": " + campos[0] + ", \"nombre\": \"" + campos[1] + "\" }";
            System.out.println("  Procesado -> " + json);
        }
        System.out.println("ProcesadorMalo: Proceso terminado.");
    }
}