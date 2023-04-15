package com.apps.boot_app.services;

import com.apps.boot_app.dao.produit_dao;
import com.apps.boot_app.models.produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class produit_service_impl implements produit_service{
    @Autowired
    private produit_dao repo;
    @Override
    public List<produit> getProduits() {
        List<produit> list=new ArrayList<>();
        for (produit temp : repo.findAll()){
            list.add(temp);
        }
        return list;
    }

    @Override
    public void addProduit(produit p) {
        repo.save(p);
    }

    @Override
    public void updateProduit(produit p) {
        repo.save(p);
    }

    @Override
    public void deletProduit(int id) {
        repo.deleteById(id);
    }

    @Override
    public produit getProduit(int id) {
        return repo.findById(id).get();
    }
}
