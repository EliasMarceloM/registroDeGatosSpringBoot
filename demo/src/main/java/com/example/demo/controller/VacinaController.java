package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Vacina;
import com.example.demo.service.VacinaService;



@RestController
@RequestMapping("/vacina")
public class VacinaController {
	
    @Autowired
    private VacinaService vacinaService ; 
    
  

    @GetMapping("/{id}")
    public Vacina getVacinaById(@PathVariable Integer id) {
        return vacinaService.getById(id);
    }

    @GetMapping("/all")
    public List<Vacina> getAllDonos() {
        return vacinaService.getAll();
    }

    @PostMapping("/save")
    public Vacina saveVacina(@RequestBody Vacina vacina) {
        return vacinaService.saveVacina(vacina);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVacina(@PathVariable Integer id) {
    	vacinaService.deleteVacina(id);
    }
    

}
