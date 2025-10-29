package org.example.ocp.before;

/**
 * Clase que VIOLA el Principio Abierto/Cerrado (OCP).
 * Está CERRADA para extensión (es difícil añadir formatos) y
 * ABIERTA a modificación (hay que cambiar el código para añadir formatos).
 */
public class GeneradorReporteMalo {

    // Este método tiene que ser modificado cada vez que añadimos un formato.
    public void generarReporte(String datos, String formato) {
        if (formato.equalsIgnoreCase("PDF")) {
            System.out.println("Generando reporte PDF para: " + datos);
            // ...lógica específica para crear un PDF...
        } else if (formato.equalsIgnoreCase("CSV")) {
            System.out.println("Generando reporte CSV para: " + datos);
            // ...lógica específica para crear un CSV...
        } else if (formato.equalsIgnoreCase("XML")) { // <-- Tuvimos que MODIFICAR la clase
            System.out.println("Generando reporte XML para: " + datos);
            // ...lógica específica para crear un XML...
        } else {
            System.err.println("Formato no soportado");
        }
    }

    // Método principal para probar
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar OCP ---");
        GeneradorReporteMalo generador = new GeneradorReporteMalo();
        generador.generarReporte("Datos de ventas", "PDF");
        generador.generarReporte("Datos de inventario", "CSV");
        // Para añadir XML, tuvimos que editar el método generarReporte.
        generador.generarReporte("Datos de usuarios", "XML");
        System.out.println("---------------------------------------");
    }
}