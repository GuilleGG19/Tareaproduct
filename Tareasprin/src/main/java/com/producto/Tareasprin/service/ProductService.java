package com.producto.Tareasprin.service;

import com.producto.Tareasprin.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public Product findById(Long id);
    public List<Product> findByName(String name);
    public void crearproducto(Product product);
    public void modificarproducto(Long id, Product product);
    public void borrarproducto(Long id);

}
