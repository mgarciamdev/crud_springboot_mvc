package com.crud.mvc.CrudSpringBoot.service;

import com.crud.mvc.CrudSpringBoot.interfaceService.IPersonaService;
import com.crud.mvc.CrudSpringBoot.interfaces.IPersona;
import com.crud.mvc.CrudSpringBoot.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersona data;
    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId() {
        return Optional.empty();
    }

    @Override
    public int save(Persona persona) {
        int res = 0;
        Persona p = data.save(persona);
        if (!p.equals(null)){
            res = 1;
        }
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
