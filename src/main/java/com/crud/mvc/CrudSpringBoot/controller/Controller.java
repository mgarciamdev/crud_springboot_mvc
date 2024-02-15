package com.crud.mvc.CrudSpringBoot.controller;

import com.crud.mvc.CrudSpringBoot.interfaceService.IPersonaService;
import com.crud.mvc.CrudSpringBoot.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

    @Autowired
    private IPersonaService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona> personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }
}