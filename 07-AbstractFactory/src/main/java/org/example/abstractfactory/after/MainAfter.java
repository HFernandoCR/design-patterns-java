package org.example.abstractfactory.after;

import org.example.abstractfactory.after.factoria.FactoriaFantasia;
import org.example.abstractfactory.after.factoria.FactoriaSciFi;
import org.example.abstractfactory.after.factoria.IFactoriaUI;

/**
 * El "Ensamblador"
 * Decide qué fábrica concreta usar y se la pasa al cliente (AplicacionUI).
 */
public class MainAfter {

    private static AplicacionUI configurarAplicacion(String tema) {
        IFactoriaUI factoria;

        // La lógica de decisión de qué familia usar está aquí,
        // fuera del cliente (AplicacionUI).
        if (tema.equalsIgnoreCase("SCIFI")) {
            factoria = new FactoriaSciFi();
        } else {
            // Por defecto usamos Fantasía
            factoria = new FactoriaFantasia();
        }

        return new AplicacionUI(factoria);
    }

    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar Abstract Factory ---");

        // Escenario 1: Queremos la UI de Fantasía
        AplicacionUI appFantasia = configurarAplicacion("FANTASIA");
        appFantasia.renderizar();

        System.out.println("---");

        // Escenario 2: Queremos la UI de Sci-Fi
        AplicacionUI appSciFi = configurarAplicacion("SCIFI");
        appSciFi.renderizar();

        // Si quisiéramos añadir un tema "Cyberpunk", solo crearíamos
        // BotonCyberpunk, PanelCyberpunk y FactoriaCyberpunk.
        // AplicacionUI y MainAfter no necesitarían cambios (solo el 'if' en configurar).

        System.out.println("-------------------------------------------------");
    }
}