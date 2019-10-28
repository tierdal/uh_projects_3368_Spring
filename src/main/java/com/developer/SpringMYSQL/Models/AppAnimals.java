package com.developer.SpringMYSQL.Models;

import javax.persistence.*;

@Entity
@Table(name = "animalfarm")
public class AppAnimals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "animal_name")
    public String animal_name;
    @Column(name = "animal_type")
    public String animal_type;
    @Column(name = "animal_age")
    public int animal_age;

    public AppAnimals(){}

    public AppAnimals(String animal_name, String animal_type, int animal_age) {
        this.animal_name = animal_name;
        this.animal_type = animal_type;
        this.animal_age = animal_age;
    }

    public int getid() {
        return id;
    }
    public void setid(int id) {this.id = id;}

    public String getAnimal_name() {
        return animal_name;
    }
    public void setAnimalName(String animal_name) {
        this.animal_name = animal_name;
    }

    public String getAnimal_type() {
        return animal_type;
    }
    public void setAnimalType(String animal_type) {
        this.animal_type = animal_type;
    }

    public int getAnimal_age() {
        return animal_age;
    }
    public void setAnimalAge(int animal_age) {
        this.animal_age = animal_age;
    }

}
