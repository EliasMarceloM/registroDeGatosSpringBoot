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

import com.example.demo.entity.Dono;
import com.example.demo.service.DonoService;



@RestController
@RequestMapping("/dono") 
public class DonoController {
    
    @Autowired
    private DonoService donoService;

    @GetMapping("/{id}")
    public Dono getDonoById(@PathVariable Integer id) {
        return donoService.getById(id);
    }
   

    @GetMapping("/all")
    public List<Dono> getAllDonos() {
        return donoService.getAll();
    }

    @PostMapping("/save")
    public Dono saveDono(@RequestBody Dono dono) {
        return donoService.saveDono(dono);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDono(@PathVariable Integer id) {
        donoService.deleteDono(id);
    }
}
