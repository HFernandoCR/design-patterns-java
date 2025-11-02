package org.example.adapter.after;

import java.util.List;
import java.util.Map;

/**
 * La Interfaz Objetivo (Target).
 * Esto es lo que nuestra aplicación cliente (ProcesadorBueno)
 * espera recibir. Queremos datos estructurados.
 */
public interface IProcesadorDatos {
    // Devuelve una lista de mapas (simulando objetos JSON)
    List<Map<String, String>> obtenerDatos();
}