package com.apps.boot_app.dao;

import com.apps.boot_app.models.produit;
import org.springframework.data.repository.CrudRepository;

public interface produit_dao extends CrudRepository<produit,Integer> {
}
