package org.example.isp.after;

// Implementa todas las interfaces que necesita.
public class TrabajadorHumanoBueno implements Trabajable, Comible, Descansable {
    @Override
    public void trabajar() {
        System.out.println("Humano trabajando...");
    }

    @Override
    public void comer() {
        System.out.println("Humano comiendo...");
    }

    @Override
    public void descansar() {
        System.out.println("Humano descansando (zzz...)");
    }
}