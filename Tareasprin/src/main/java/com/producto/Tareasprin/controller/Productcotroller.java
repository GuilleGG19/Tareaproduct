package com.producto.Tareasprin.controller;

import com.producto.Tareasprin.entity.Product;
import com.producto.Tareasprin.service.ProductService;
import com.producto.Tareasprin.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class Productcotroller {
    @Autowired
    ProductService productService;
    @GetMapping
    public List<Product> listarproductos(){
        return productService.findAll();
    }
    //requestparam sirve para que el campo no quede en blanco
    @GetMapping(value = "/{id}")
    public Product obtenerproducto(@RequestParam Long id){
        return productService.findById(id);
    }
    @GetMapping(value = "/{name}")
    public List<Product> nombreproducto(@RequestParam String name){
        return productService.findByName(name);
    }
    @PostMapping()
    public void crearproductos(@RequestBody Product product ){
        productService.crearproducto(product);
    }
    @PutMapping(value = "/{id}")
    public void modificarproductos(@PathVariable Long id, @RequestBody Product product){
        productService.modificarproducto(id, product);
    }
    @DeleteMapping(value = "/{id}")
    public void borrarproducto(@PathVariable Long id){
        productService.borrarproducto(id);
    }

}
