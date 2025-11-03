package org.example.facade.after;

import org.example.facade.after.subsistema.SubsystemaAudio;
import org.example.facade.after.subsistema.SubsystemaFisica;
import org.example.facade.after.subsistema.SubsystemaGraficos;

/**
 * La Fachada (Facade).
 * Proporciona una interfaz simple (ej. iniciarJuego)
 * que esconde la complejidad del subsistema (audio, gráficos, física).
 */
public class GameEngineFacade {

    // La fachada posee y gestiona las instancias del subsistema
    private SubsystemaAudio audio;
    private SubsystemaGraficos graficos;
    private SubsystemaFisica fisica;

    public GameEngineFacade() {
        // La fachada crea el subsistema complejo
        this.audio = new SubsystemaAudio();
        this.graficos = new SubsystemaGraficos();
        this.fisica = new SubsystemaFisica();
    }

    /**
     * Operación simple para el cliente.
     * La fachada coordina el orden y la lógica de inicialización.
     */
    public void iniciarJuego() {
        System.out.println("...Iniciando juego (vía Fachada)...");
        audio.inicializarAudio();
        fisica.inicializarFisica();
        graficos.configurarResolucion();
        audio.cargarEfectosSonido();
        System.out.println("¡Juego listo para empezar!");
    }

    /**
     * Operación simple para el cliente.
     */
    public void detenerJuego() {
        System.out.println("...Deteniendo juego (vía Fachada)...");
        audio.detenerAudio();
        fisica.detenerFisica();
        graficos.liberarMemoriaVideo();
        System.out.println("Juego detenido.");
    }

    // La fachada también puede exponer algunas operaciones
    // de bajo nivel si es necesario, pero el objetivo es simplificar.
    public void simularFrame() {
        graficos.renderizar();
        fisica.calcularColisiones();
    }
}