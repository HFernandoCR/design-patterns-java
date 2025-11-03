package org.example.facade.before;

/**
 * El Cliente (Antes).
 * El cliente está fuertemente acoplado al subsistema.
 * Conoce todas las clases y el orden correcto de inicialización.
 */
public class MainBefore {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar Facade ---");

        // El cliente tiene que crear e inicializar todo manualmente
        System.out.println("...Iniciando juego manualmente...");
        SubsystemaAudio audio = new SubsystemaAudio();
        SubsystemaGraficos graficos = new SubsystemaGraficos();
        SubsystemaFisica fisica = new SubsystemaFisica();

        // El cliente debe saber el orden correcto
        audio.inicializarAudio();
        fisica.inicializarFisica();
        graficos.configurarResolucion();
        audio.cargarEfectosSonido();

        System.out.println("...Juego en marcha (simulación)...");
        graficos.renderizar();
        fisica.calcularColisiones();

        System.out.println("...Deteniendo juego manualmente...");
        audio.detenerAudio();
        fisica.detenerFisica();
        graficos.liberarMemoriaVideo();

        System.out.println("---------------------------------------");
    }
}