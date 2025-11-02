package org.example.adapter.after;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * El Adaptador (Adapter).
 * 1. Implementa la interfaz que el cliente espera (IProcesadorDatos).
 * 2. Contiene una referencia al servicio incompatible (ApiExternaCsv).
 */
public class CsvAdapter implements IProcesadorDatos {

    // 2. Contiene la referencia al servicio incompatible
    private ApiExternaCsv apiIncompatible = new ApiExternaCsv();

    /**
     * 1. Implementa el método que el cliente espera.
     * Aquí ocurre la "magia" de la traducción.
     */
    @Override
    public List<Map<String, String>> obtenerDatos() {
        System.out.println("CsvAdapter: Llamando a la API incompatible...");
        String datosCsv = apiIncompatible.obtenerDatosCsv();

        System.out.println("CsvAdapter: Adaptando CSV a formato JSON (Lista de Mapas)...");
        List<Map<String, String>> datosAdaptados = new ArrayList<>();

        String[] lineas = datosCsv.split("\n");
        if (lineas.length < 2) {
            return datosAdaptados; // No hay datos o solo cabecera
        }

        String[] cabeceras = lineas[0].split(",");

        for (int i = 1; i < lineas.length; i++) {
            String[] campos = lineas[i].split(",");
            Map<String, String> objetoJson = new HashMap<>();
            for (int j = 0; j < cabeceras.length; j++) {
                objetoJson.put(cabeceras[j], campos[j]);
            }
            datosAdaptados.add(objetoJson);
        }

        System.out.println("CsvAdapter: Adaptación completada.");
        return datosAdaptados;
    }
}