package com.crud.mvc.CrudSpringBoot.interfaceService;

import com.crud.mvc.CrudSpringBoot.modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    public List<Persona> listar();

    public Optional<Persona> listarId(int id);

    public int save(Persona persona);

    public void delete(int id);
}
