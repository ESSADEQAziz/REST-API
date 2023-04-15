package com.apps.boot_app.controllers;

import com.apps.boot_app.models.produit;
import com.apps.boot_app.services.produit_service;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class REST_API {
    @Autowired
    private produit_service prod_services;

    @Operation(summary = "Get a list of all the products ")
    @GetMapping(value = "/products")
    public List<produit> getProducts(){
        return prod_services.getProduits();
    }
    @Operation(summary = "Add a product ")
    @PostMapping(value = "/addProduct")
    public void addProduct(@RequestBody produit prod){
        prod_services.addProduit(prod);
    }
    @Operation(summary = "Update a product  ")
    @PutMapping(value = "/updateProduct")
    public void updateProduct(@RequestBody produit prod){
        prod_services.updateProduit(prod);
    }
    @Operation(summary = "Delete a product ")
    @DeleteMapping(value = "/deletProduct/{idProd}")
    public void deletProduct(@Parameter(description = "id of product to be deleted") @PathVariable int idProd){
        prod_services.deletProduit(idProd);
    }
    @Operation(summary = "Get a single product ")
    @GetMapping(value = "/product/{idProd}")
    public produit getProduct(@Parameter(description = "id of product to be searched") @PathVariable int idProd){
        return prod_services.getProduit(idProd);
    }


}
