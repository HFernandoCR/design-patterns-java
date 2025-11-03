package org.example.facade.before;

// Parte 1 del subsistema complejo
public class SubsystemaAudio {
    public void inicializarAudio() {
        System.out.println("SubsystemaAudio: Inicializado.");
    }
    public void cargarEfectosSonido() {
        System.out.println("SubsystemaAudio: Cargando efectos de sonido...");
    }
    public void detenerAudio() {
        System.out.println("SubsystemaAudio: Detenido.");
    }
}