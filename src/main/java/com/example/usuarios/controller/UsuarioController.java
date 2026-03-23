package com.example.usuarios.controller;

import com.example.usuarios.model.Usuario;
import com.example.usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// Controlador principal
@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService servicio;

    // Mostrar formulario
    @GetMapping("/formulario")
    public String formulario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "formulario";
    }

    // Guardar usuario
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Usuario usuario) {
        servicio.guardar(usuario);
        return "redirect:/lista";
    }

    // Listar usuarios
    @GetMapping("/lista")
    public String lista(Model model) {
        model.addAttribute("usuarios", servicio.listar());
        return "lista";
    }
}