package org.example.ocp.after;

/**
 * Clase Contexto.
 * Está CERRADA a modificaciones (su método generar() no cambia).
 * Está ABIERTA a extensiones (acepta cualquier FormatoReporte).
 */
public class GeneradorReporteBueno {

    /**
     * Este método no necesita 'if/else' y no cambiará si añadimos
     * nuevos formatos. Depende de la abstracción (Interfaz).
     */
    public void generar(String datos, FormatoReporte formato) {
        // Delega la responsabilidad de la generación al objeto concreto
        formato.generar(datos);
    }
}