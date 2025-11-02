package org.example.logic.repository;

import org.example.logic.model.TipoUsuario;
import org.example.logic.model.Usuario;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

// Implementación concreta (Bajo Nivel) - Simula la base de datos
public class RepositorioUsuarioMemoria implements RepositorioUsuario {
    private Map<String, Usuario> baseDeDatosSimulada = new HashMap<>();

    public RepositorioUsuarioMemoria() {
        // Datos de prueba
        baseDeDatosSimulada.put("Ana", new Usuario("Ana", TipoUsuario.PREMIUM, LocalDate.now().minusDays(60))); // Antiguo
        baseDeDatosSimulada.put("Beto", new Usuario("Beto", TipoUsuario.PREMIUM, LocalDate.now().minusDays(10))); // Nuevo
        baseDeDatosSimulada.put("Carlos", new Usuario("Carlos", TipoUsuario.GRATUITO, LocalDate.now().minusDays(100))); // Gratuito
    }

    @Override
    public Usuario buscarPorNombre(String nombre) {
        System.out.println("Repositorio: Buscando a '" + nombre + "' en la base de datos...");
        return baseDeDatosSimulada.get(nombre);
    }
}