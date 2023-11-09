package com.example.api.Api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.api.Api.model.Produit;
import com.example.api.Api.repository.ProduitRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProduitServiceImplemention implements ProduiService {

    private final ProduitRepo produitRepo;

    @Override
    public Produit creation(Produit produit) {
        return produitRepo.save(produit);
    }

    @Override
    public List<Produit> lecture() {
        return produitRepo.findAll();
    }

    @Override
    public Produit modification(Long id, Produit produit) {
        return produitRepo.findById(id).map(
            p -> {
                p.setNom(produit.getNom());
                p.setDescription(produit.getDescription());
                p.setPrix(produit.getPrix());
                return produitRepo.save(p);
            }
        ).orElseThrow(() -> new RuntimeException("Produit non trouvé !!!") );
    }
    

    @Override
    public String suppression(Long id) {
        produitRepo.deleteById(id);
        return "Produit supprimé !";
    }
    
}
