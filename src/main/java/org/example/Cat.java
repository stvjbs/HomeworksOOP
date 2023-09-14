package org.example;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal{
    private String breed;

    public Cat(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color,
               Integer canGo, Integer canFly, Integer canSwim, String breed) {
        super(name, weight, owner, birthDay, vaccinations, color, canGo, canFly, canSwim);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
