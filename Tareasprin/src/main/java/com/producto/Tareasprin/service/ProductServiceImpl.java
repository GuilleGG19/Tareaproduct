package com.producto.Tareasprin.service;

import com.producto.Tareasprin.dao.ProductDao;
import com.producto.Tareasprin.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

// implemento la interface producService y le doy al foco rojo para implementar los metodos
public class ProductServiceImpl implements ProductService{
    //el autowired es para poder inyectar el Dao
    @Autowired
    private ProductDao productDao;

    // quito el null y agrego (List<Product>)productDao.findAll(), es para que me salga la lista de productos
    @Override
    public List<Product> findAll() {
        return (List<Product>)productDao.findAll() ;
    }
    // el orElse si no encuentra la id devuelve nulo
    @Override
    public Product findById(Long id) {
        return productDao.findById(id).orElse(null);
    }

    @Override
    public List<Product> findByName(String name) {
        return productDao.findByName(name);
    }

    @Override
    public void crearproducto(Product product) {
        productDao.save(product);

    }

    @Override
    public void modificarproducto(Long id, Product product) {
        if (productDao.existsById(id)){
            product.setId(id);
            productDao.save(product);
        }
    }

    @Override
    public void borrarproducto(Long id) {
        if (productDao.existsById(id)){
            productDao.deleteById(id);
        }

    }
}
