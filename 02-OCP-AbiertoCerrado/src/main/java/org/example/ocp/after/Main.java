package org.example.ocp.after;

/**
 * Clase principal para probar la implementación de OCP.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar OCP ---");
        GeneradorReporteBueno generador = new GeneradorReporteBueno();

        // Creamos las "estrategias" o formatos
        FormatoReporte formatoPdf = new ReportePdf();
        FormatoReporte formatoCsv = new ReporteCsv();

        // Usamos los formatos existentes
        generador.generar("Datos de ventas", formatoPdf);
        generador.generar("Datos de inventario", formatoCsv);

        System.out.println("...Añadiendo nueva funcionalidad (XML) sin modificar el generador...");

        // ¡Añadimos el nuevo formato sin cambiar GeneradorReporteBueno!
        FormatoReporte formatoXml = new ReporteXml();
        generador.generar("Datos de usuarios", formatoXml);

        System.out.println("----------------------------------------");
    }
}