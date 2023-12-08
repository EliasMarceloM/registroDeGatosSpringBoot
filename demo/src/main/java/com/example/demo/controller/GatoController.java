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

import com.example.demo.entity.Gato;
import com.example.demo.service.GatoService;

@RestController
@RequestMapping("/gato") 
public class GatoController {

    @Autowired
    private GatoService gatoService;

    @GetMapping("/{id}")
    public Gato getGatoById(@PathVariable Integer id) {
        return gatoService.getById(id);
    }

    @GetMapping("/all")
    public List<Gato> getAllGatos() {
        return gatoService.getAll();
    }

    @PostMapping("/save")
    public Gato saveGato(@RequestBody Gato gato) {
    	
        return gatoService.saveGato(gato);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGato(@PathVariable Integer id) {
        gatoService.deleteGato(id);
    }

}
