package org.example.factorymethod.after.visualizador;

import org.example.factorymethod.after.grafico.Grafico;

/**
 * El Creador Abstracto (Creator).
 * Define el "Factory Method" (crearGrafico) como abstracto.
 */
public abstract class Visualizador {

    /**
     * Este es el "Método de Fábrica" (Factory Method).
     * Las subclases decidirán qué objeto concreto instanciar.
     */
    public abstract Grafico crearGrafico();

    /**
     * Lógica de negocio principal.
     * Utiliza el factory method para obtener un producto y luego usarlo.
     * Esta lógica no cambia entre creadores.
     */
    public void mostrar() {
        System.out.print(this.getClass().getSimpleName() + " dice: ");
        Grafico g = crearGrafico(); // Llama al factory method
        g.renderizar();
    }
}