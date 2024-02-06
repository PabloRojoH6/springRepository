package com.ejemplos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplos.models.dao.IAlimentoDao;
import com.ejemplos.models.entity.Alimento;




/*
 * Una clase Service está basada en el patrón de diseño Facade:
 * un único punto de acceso a clases DAO. Por cada clase DAO hay una clase Service
 * 
 * */
@Service
public class AlimentoServiceImpl implements IAlimentoService{

	@Autowired
	private IAlimentoDao alimentoDao;
	
	// el tratamiento de las transacciones va en la clase Service (no en los DAO)
	// también en un método Service podemos usar varios métodos DAO
	// dentro de la misma transacción
	@Override
	@Transactional(readOnly = true)
	public List<Alimento> findAll(){
		// TODO Auto-generated method stub
		return (List<Alimento>) alimentoDao.findAll();
	}

	@Override
	public void save(Alimento libro) {
		// TODO Auto-generated method stub
		alimentoDao.save(libro);
	}

	@Override
	public Alimento findOne(String codigo) {
		// TODO Auto-generated method stub
		return alimentoDao.findById(codigo).orElse(null);
	}

	@Override
	public void delete(String codigo) {
		// TODO Auto-generated method stub
		alimentoDao.deleteById(codigo);
	}	
	
}
