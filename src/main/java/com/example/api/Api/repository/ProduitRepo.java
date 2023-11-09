package com.example.api.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.Api.model.Produit;

public interface ProduitRepo extends JpaRepository<Produit, Long>  {

    

    
}
