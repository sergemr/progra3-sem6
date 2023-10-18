package com.semana6practica.semana6;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String name;
    private String type;
    private String sound;

    private List<Animal> animals = new ArrayList<Animal>();

    public Animal(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
  
    }
    
    public String getName() {
        return name;
    }

    public String getAnimals() {

        for (Animal animalIteracion : animals) {
            System.out.println(animalIteracion.getName());
        }
        return animals.toString();
    }

    public void addAnimal(Animal animal)
    {
        animals.add(animal);
    }
    public void removeAnimal(int index) {
        animals.remove(index);
    }



    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
          this.type = type;
      
    }
}
