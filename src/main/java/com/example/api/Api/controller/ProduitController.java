package com.example.api.Api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.Api.model.Produit;
import com.example.api.Api.services.ProduiService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {


    private final ProduiService produitService;


    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit){
        return produitService.creation(produit);
    }

    @GetMapping("/read")
    public List<Produit> read(){
        return produitService.lecture();
    }

    @PutMapping("/update/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit ){
        return produitService.modification(id, produit);
    }

    @DeleteMapping("/delete")
    public String delete(@PathVariable Long id){
        return produitService.suppression(id);
    }



    
    
}
