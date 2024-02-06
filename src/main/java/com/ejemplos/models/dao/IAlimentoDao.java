package com.ejemplos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ejemplos.models.entity.Alimento;

public interface IAlimentoDao extends CrudRepository<Alimento, String>{
}
