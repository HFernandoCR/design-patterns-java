package org.example.abstractfactory.after.factoria;

import org.example.abstractfactory.after.boton.Boton;
import org.example.abstractfactory.after.panel.Panel;

/**
 * Interfaz Abstract Factory.
 * Declara métodos para crear cada producto de la familia (Botón y Panel)[cite: 1659].
 */
public interface IFactoriaUI {
    Boton crearBoton();
    Panel crearPanel();
}