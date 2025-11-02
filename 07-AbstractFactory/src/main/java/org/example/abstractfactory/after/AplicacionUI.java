package org.example.abstractfactory.after;

import org.example.abstractfactory.after.boton.Boton;
import org.example.abstractfactory.after.panel.Panel;
import org.example.abstractfactory.after.factoria.IFactoriaUI;

/**
 * El Cliente.
 * Depende solo de las interfaces abstractas (IFactoriaUI, Boton, Panel)[cite: 1665].
 * No sabe si está usando Fantasía o Sci-Fi.
 */
public class AplicacionUI {
    private Boton boton;
    private Panel panel;

    // La aplicación recibe la fábrica (inyección de dependencias)
    public AplicacionUI(IFactoriaUI factoria) {
        System.out.println("AplicacionUI: Creando UI con la factoría: " + factoria.getClass().getSimpleName());
        // El cliente pide productos abstractos, la fábrica le da concretos
        this.boton = factoria.crearBoton();
        this.panel = factoria.crearPanel();
    }

    public void renderizar() {
        boton.renderizar();
        panel.renderizar();
    }
}