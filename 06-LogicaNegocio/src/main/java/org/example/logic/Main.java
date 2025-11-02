package org.example.logic;

import org.example.logic.repository.RepositorioUsuario;
import org.example.logic.repository.RepositorioUsuarioMemoria;
import org.example.logic.service.ServicioPromocion;

/**
 * Capa de Presentación o "Ensamblador".
 * Simula el controlador que llama al servicio.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Demostración de Lógica de Negocio Separada ---");

        // 1. Creamos la implementación de bajo nivel (Acceso a Datos)
        RepositorioUsuario repo = new RepositorioUsuarioMemoria();

        // 2. Creamos el servicio (Lógica de Negocio) y le inyectamos la dependencia
        ServicioPromocion servicio = new ServicioPromocion(repo);

        // 3. Simulamos peticiones de la capa de presentación (Controlador/UI)

        System.out.println("\n--- Caso 1: Ana (Premium, > 30 días) ---");
        boolean elegibleAna = servicio.esElegibleParaCupon("Ana");
        System.out.println("Resultado Final: " + (elegibleAna ? "Enviar Cupón" : "No Enviar Cupón"));

        System.out.println("\n--- Caso 2: Beto (Premium, < 30 días) ---");
        boolean elegibleBeto = servicio.esElegibleParaCupon("Beto");
        System.out.println("Resultado Final: " + (elegibleBeto ? "Enviar Cupón" : "No Enviar Cupón"));

        System.out.println("\n--- Caso 3: Carlos (Gratuito) ---");
        boolean elegibleCarlos = servicio.esElegibleParaCupon("Carlos");
        System.out.println("Resultado Final: " + (elegibleCarlos ? "Enviar Cupón" : "No Enviar Cupón"));

        System.out.println("-------------------------------------------------");
    }
}