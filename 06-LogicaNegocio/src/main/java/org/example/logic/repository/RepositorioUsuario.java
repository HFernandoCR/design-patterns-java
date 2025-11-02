package org.example.logic.repository;

import org.example.logic.model.Usuario;

// Abstracción para el acceso a datos (siguiendo DIP)
public interface RepositorioUsuario {
    Usuario buscarPorNombre(String nombre);
    // (Aquí irían métodos como guardar, actualizar, etc.)
}