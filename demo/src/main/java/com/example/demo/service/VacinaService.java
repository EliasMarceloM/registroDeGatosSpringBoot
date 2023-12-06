package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Vacina;
import com.example.demo.repository.VacinaRepository;



@Service
public class VacinaService {
	@Autowired
	VacinaRepository vacinaRepository;
	
	//--
	public Vacina getById(Integer id) {
		return vacinaRepository.findById(id).orElse(null) ;
	}
	
	public List<Vacina> getAll(){
		return vacinaRepository.findAll();
	}
	
	public Vacina saveVacina(Vacina vacina) {
		return vacinaRepository.save(vacina);
	}
	public void deleteVacina(Integer id) {
		vacinaRepository.deleteById(id);
	}
	//--
}
