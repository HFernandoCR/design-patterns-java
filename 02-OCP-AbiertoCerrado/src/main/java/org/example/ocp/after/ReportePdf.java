package org.example.ocp.after;

/**
 * Una implementación concreta (Extensión 1).
 */
public class ReportePdf implements FormatoReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte PDF para: " + datos);
        // ...lógica específica para crear un PDF...
    }
}