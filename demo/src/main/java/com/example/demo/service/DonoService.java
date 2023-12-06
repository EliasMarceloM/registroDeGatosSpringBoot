package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dono;
import com.example.demo.repository.DonoRepository;



@Service
public class DonoService {
	@Autowired
	DonoRepository donoRepository;
	
	public Dono getById(Integer id) {
		return donoRepository.findById(id).orElse(null) ;
	}
	
	public List<Dono> getAll(){
		return donoRepository.findAll();
	}
	
	public Dono saveDono(Dono dono) {
		return donoRepository.save(dono);
	}
	public void deleteDono(Integer id) {
		donoRepository.deleteById(id);
	}

}
