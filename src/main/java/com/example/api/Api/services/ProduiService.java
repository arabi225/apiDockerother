package com.example.api.Api.services;

import java.util.List;

import com.example.api.Api.model.Produit;

public interface ProduiService {

    Produit creation(Produit produit);

    List<Produit> lecture();

    Produit modification(Long id, Produit produit);

    String suppression(Long id);
    
}
