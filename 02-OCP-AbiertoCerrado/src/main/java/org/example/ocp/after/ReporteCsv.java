package org.example.ocp.after;

/**
 * Otra implementación concreta (Extensión 2).
 */
public class ReporteCsv implements FormatoReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte CSV para: " + datos);
        // ...lógica específica para crear un CSV...
    }
}