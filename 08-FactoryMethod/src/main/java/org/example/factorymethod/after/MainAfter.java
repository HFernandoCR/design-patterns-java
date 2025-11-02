package org.example.factorymethod.after;

import org.example.factorymethod.after.visualizador.Visualizador;
import org.example.factorymethod.after.visualizador.VisualizadorBarra;
import org.example.factorymethod.after.visualizador.VisualizadorLinea;
import org.example.factorymethod.after.visualizador.VisualizadorTorta;

public class MainAfter {

    // Variable para inicializar el tipo de visualizador que queremos
    private static Visualizador visualizadorActual;

    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar Factory Method ---");

        // El cliente decide qué CREADOR usar...
        visualizadorActual = new VisualizadorBarra();
        // ...y luego solo llama a la lógica de negocio (mostrar),
        // sin saber qué gráfico concreto se está creando.
        visualizadorActual.mostrar();

        // Cambiamos de creador
        visualizadorActual = new VisualizadorTorta();
        visualizadorActual.mostrar();

        // Añadimos la nueva funcionalidad (Gráfico de Línea)
        // Simplemente instanciamos el nuevo creador. No se modificó
        // la clase Visualizador ni el código cliente (el método main).
        visualizadorActual = new VisualizadorLinea();
        visualizadorActual.mostrar();

        System.out.println("-------------------------------------------------");
    }
}