package com.producto.Tareasprin.dao;

import com.producto.Tareasprin.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductDao extends CrudRepository<Product, Long> {
    List<Product> findByName(String name);
}
