package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Gato;
import com.example.demo.repository.GatoRepository;


@Service
public class GatoService {
	@Autowired
	GatoRepository gatoRepository;
	
	//--
	public Gato getById(Integer id) {
		return gatoRepository.findById(id).orElse(null) ;
	}
	
	public List<Gato> getAll(){
		return gatoRepository.findAll();
	}
	
	public Gato saveGato(Gato gato) {
		return gatoRepository.save(gato);
	}
	public void deleteGato(Integer id) {
		gatoRepository.deleteById(id);
	}
	//--
}