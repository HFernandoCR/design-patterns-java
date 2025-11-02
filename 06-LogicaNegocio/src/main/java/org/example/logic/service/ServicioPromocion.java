package org.example.logic.service;

import org.example.logic.model.TipoUsuario;
import org.example.logic.model.Usuario;
import org.example.logic.repository.RepositorioUsuario;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Módulo de Alto Nivel - Aquí reside la LÓGICA DE NEGOCIO.
 * No sabe cómo se guardan los datos, solo aplica las reglas.
 */
public class ServicioPromocion {

    private RepositorioUsuario repositorio;

    // Dependemos de la abstracción (DIP)
    public ServicioPromocion(RepositorioUsuario repositorio) {
        this.repositorio = repositorio;
    }

    /**
     * Esta es la LÓGICA DE NEGOCIO pura.
     * Regla: Cupón solo para PREMIUM con > 30 días.
     */
    public boolean esElegibleParaCupon(String nombreUsuario) {
        System.out.println("Servicio: Verificando elegibilidad de '" + nombreUsuario + "'...");
        Usuario usuario = repositorio.buscarPorNombre(nombreUsuario);

        if (usuario == null) {
            System.out.println("Servicio (Regla): Usuario no encontrado.");
            return false;
        }

        // REGLA 1: Debe ser PREMIUM
        if (usuario.getTipo() != TipoUsuario.PREMIUM) {
            System.out.println("Servicio (Regla): NO ELEGIBLE. Motivo: No es PREMIUM.");
            return false;
        }

        // REGLA 2: Debe tener > 30 días de antigüedad
        long diasRegistrado = ChronoUnit.DAYS.between(usuario.getFechaRegistro(), LocalDate.now());
        if (diasRegistrado <= 30) {
            System.out.println("Servicio (Regla): NO ELEGIBLE. Motivo: Es PREMIUM pero muy nuevo (" + diasRegistrado + " días).");
            return false;
        }

        System.out.println("Servicio (Regla): ¡ELEGIBLE! Cumple todas las condiciones.");
        return true;
    }
}