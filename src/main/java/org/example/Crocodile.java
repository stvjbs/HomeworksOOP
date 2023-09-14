package org.example;

import java.time.LocalDate;
import java.util.List;

public class Crocodile extends Animal{
    public Crocodile(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations,
                     Color color, Integer canGo, Integer canFly, Integer canSwim) {
        super(name, weight, owner, birthDay, vaccinations, color, canGo, canFly, canSwim);
    }
}
