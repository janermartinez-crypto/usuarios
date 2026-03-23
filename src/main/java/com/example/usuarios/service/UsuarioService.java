package com.example.usuarios.service;

import com.example.usuarios.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Servicio que maneja la lógica
@Service
public class UsuarioService {

    private List<Usuario> lista = new ArrayList<>();

    // Método para guardar usuario
    public void guardar(Usuario usuario) {
        lista.add(usuario);
    }

    // Método para listar usuarios
    public List<Usuario> listar() {
        return lista;
    }
}