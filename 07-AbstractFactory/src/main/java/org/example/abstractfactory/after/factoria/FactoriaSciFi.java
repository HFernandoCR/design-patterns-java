package org.example.abstractfactory.after.factoria;

import org.example.abstractfactory.after.boton.Boton;
import org.example.abstractfactory.after.boton.BotonSciFi;
import org.example.abstractfactory.after.panel.Panel;
import org.example.abstractfactory.after.panel.PanelSciFi;

/**
 * Fábrica Concreta 2: Crea la familia de productos de Sci-Fi[cite: 1660].
 */
public class FactoriaSciFi implements IFactoriaUI {
    @Override
    public Boton crearBoton() {
        return new BotonSciFi();
    }

    @Override
    public Panel crearPanel() {
        return new PanelSciFi();
    }
}