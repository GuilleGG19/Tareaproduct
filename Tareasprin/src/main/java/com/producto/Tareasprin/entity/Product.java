package com.producto.Tareasprin.entity;

import javax.persistence.*;
import java.util.Date;

//entity es para reconocer una entidad
@Entity
//para especificar que es una tabla
@Table(name="elementos")
public class Product {
    //id es para especificar que la variable se vuelva llave primaria
    // y el generatevalue es para generarlo automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //estos son objetos/nombre de las columnas
    private long id;
    private String name;
    private String marca;
    private String descripcion;
    private double precio;

    //temporal es para tomar el tiempo real
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    //con clic derecho creo los getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
