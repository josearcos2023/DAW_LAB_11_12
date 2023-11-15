package com.miempresa.controller;

import com.miempresa.DTO.formularioDTO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class controladorFormulario {

    @GetMapping("/formularioRegistro")
    public String envioFormulario(Model model){
        model.addAttribute("form", new formularioDTO());
        return "formulario";
    }
}
