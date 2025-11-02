package org.example.adapter.after;

import java.util.List;
import java.util.Map;

/**
 * El Cliente.
 * Ahora depende solo de la interfaz IProcesadorDatos (DIP).
 * No sabe nada de CSV, solo espera datos estructurados.
 */
public class ProcesadorBueno {

    // Depende de la interfaz
    private IProcesadorDatos procesadorDatos;

    // Recibe la dependencia (podría ser un adapter o un conector JSON nativo)
    public ProcesadorBueno(IProcesadorDatos procesadorDatos) {
        this.procesadorDatos = procesadorDatos;
    }

    public void procesar() {
        System.out.println("ProcesadorBueno: Iniciando proceso...");
        List<Map<String, String>> datos = procesadorDatos.obtenerDatos();

        // El cliente solo trabaja con los datos estructurados
        System.out.println("ProcesadorBueno: Procesando datos recibidos...");
        for (Map<String, String> objeto : datos) {
            System.out.println("  Procesando usuario: " + objeto.get("nombre"));
        }
        System.out.println("ProcesadorBueno: Proceso terminado.");
    }
}