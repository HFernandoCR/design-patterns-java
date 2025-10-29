package org.example.ocp.after;

/**
 * ¡NUEVA FUNCIONALIDAD! (Extensión 3)
 * Añadimos esta clase sin tocar GeneradorReporteBueno.
 */
public class ReporteXml implements FormatoReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte XML para: " + datos);
        // ...lógica específica para crear un XML...
    }
}