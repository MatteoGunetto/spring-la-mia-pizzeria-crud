package org.lesson.java.springLaMiaPizzeriaCrud.DB;

import jakarta.validation.constraints.NotEmpty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
@Entity
public class Pizze {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;


    @NotBlank(message="Non può essere vuoto")
    private String name;

    @NotBlank(message="Non può essere vuoto")
    private String description;

    @NotEmpty(message="Non può essere vuoto")
    private String picture;

    @Positive(message="deve essere positivo")
    private float price;

    public Pizze() {}
    public Pizze(String name, String description, String picture, float price) {
        setName(name);
        setDescription(description);
        setPicture(picture);
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}