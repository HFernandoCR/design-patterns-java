package org.example.ocp.after;

/**
 * La Abstracción (Interfaz).
 * Define el contrato que todas las "extensiones" (formatos) deben cumplir.
 */
public interface FormatoReporte {
    void generar(String datos);
}