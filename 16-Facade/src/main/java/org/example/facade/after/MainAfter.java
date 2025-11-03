package org.example.facade.after;

/**
 * El Cliente (Después).
 * Solo necesita conocer la Fachada.
 * Está desacoplado del subsistema complejo.
 */
public class MainAfter {
    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar Facade ---");

        // El cliente solo interactúa con la fachada
        GameEngineFacade game = new GameEngineFacade();

        // El cliente usa métodos simples
        game.iniciarJuego();

        System.out.println("...Juego en marcha (simulación)...");
        game.simularFrame();
        game.simularFrame();

        game.detenerJuego();

        System.out.println("------------------------------------------");
    }
}