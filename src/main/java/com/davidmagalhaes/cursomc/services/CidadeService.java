package com.davidmagalhaes.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidmagalhaes.cursomc.domain.Cidade;
import com.davidmagalhaes.cursomc.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;
	
	public List<Cidade> findByEstado(Integer estado_id){
		return repo.findCidades(estado_id);
	}
}
