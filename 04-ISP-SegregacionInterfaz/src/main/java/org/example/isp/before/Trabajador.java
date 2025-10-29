package org.example.isp.before;

/**
 * Interfaz "gorda" que VIOLA ISP.
 * Obliga a todas las clases a implementar métodos que quizás no necesiten.
 */
public interface Trabajador {
    void trabajar();
    void comer();
    void descansar();
}