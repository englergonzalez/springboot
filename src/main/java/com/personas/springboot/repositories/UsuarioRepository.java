package com.personas.springboot.repositories;

import java.util.ArrayList;

import com.personas.springboot.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByIdentificacion(Integer identificacion);
}


