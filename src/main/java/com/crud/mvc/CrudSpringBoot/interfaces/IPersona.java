package com.crud.mvc.CrudSpringBoot.interfaces;

import com.crud.mvc.CrudSpringBoot.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {
}
