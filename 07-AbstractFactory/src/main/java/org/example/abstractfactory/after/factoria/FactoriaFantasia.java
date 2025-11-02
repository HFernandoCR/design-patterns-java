package org.example.abstractfactory.after.factoria;

import org.example.abstractfactory.after.boton.Boton;
import org.example.abstractfactory.after.boton.BotonFantasia;
import org.example.abstractfactory.after.panel.Panel;
import org.example.abstractfactory.after.panel.PanelFantasia;

/**
 * Fábrica Concreta 1: Crea la familia de productos de Fantasía[cite: 1660].
 */
public class FactoriaFantasia implements IFactoriaUI {
    @Override
    public Boton crearBoton() {
        return new BotonFantasia();
    }

    @Override
    public Panel crearPanel() {
        return new PanelFantasia();
    }
}