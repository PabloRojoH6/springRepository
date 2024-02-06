package com.ejemplos.models.service;

import java.util.List;


import com.ejemplos.models.entity.Alimento;

public interface IAlimentoService {
	
	public List<Alimento> findAll();
	
	public void save(Alimento alimento);
	
	public Alimento findOne(String codigo);
	
	public void delete(String codigo);
	
}
