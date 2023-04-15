package com.apps.boot_app.services;

import com.apps.boot_app.models.produit;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface produit_service {
    public List<produit> getProduits();
    public void addProduit(produit p);
    public void updateProduit(produit p);
    public void deletProduit(int id);
    public produit getProduit(int id);
}
