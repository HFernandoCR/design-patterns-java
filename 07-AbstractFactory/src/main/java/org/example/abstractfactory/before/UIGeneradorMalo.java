package org.example.abstractfactory.before;

// Clases concretas de elementos UI
class BotonFantasia {
    public void renderizar() { System.out.println("Renderizando botón de FANTASÍA (con runas)"); }
}
class PanelFantasia {
    public void renderizar() { System.out.println("Renderizando panel de FANTASÍA (de madera)"); }
}
class BotonSciFi {
    public void renderizar() { System.out.println("Renderizando botón SCI-FI (holográfico)"); }
}
class PanelSciFi {
    public void renderizar() { System.out.println("Renderizando panel SCI-FI (de metal)"); }
}


/**
 * VIOLA OCP y DIP.
 * Esta clase está fuertemente acoplada a las clases concretas.
 * Si añadimos un nuevo tema (ej. "Cyberpunk"), TENEMOS QUE MODIFICAR esta clase.
 */
public class UIGeneradorMalo {
    private String temaActual;

    public UIGeneradorMalo(String tema) {
        this.temaActual = tema;
    }

    // El cliente tiene que pedir objetos individuales
    public void renderizarUICompleta() {
        if (temaActual.equalsIgnoreCase("FANTASIA")) {
            BotonFantasia btn = new BotonFantasia();
            PanelFantasia panel = new PanelFantasia();
            btn.renderizar();
            panel.renderizar();
        } else if (temaActual.equalsIgnoreCase("SCIFI")) {
            BotonSciFi btn = new BotonSciFi();
            PanelSciFi panel = new PanelSciFi();
            btn.renderizar();
            panel.renderizar();
        } else {
            throw new IllegalArgumentException("Tema no soportado");
        }
    }
}