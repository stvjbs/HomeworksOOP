package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));
        Animal barsik = new Cat("barsik", 10.0, alex, LocalDate.now(), List.of(chumka), Color.BLACK,
                1, 0 , 0 , "siamskiy");
        Animal kesha = new Bird("Kesha", 0.1, alex, LocalDate.now(), List.of(chumka), Color.GREEN,
                1,1,0);
        Animal dayneris = new Dragon("Dayneris", 200.0, alex, LocalDate.now(),List.of(chumka),
                Color.RED,1,1,0);
        Animal nemo = new Fish("Nemo", 0.1, alex,LocalDate.now(),List.of(chumka), Color.BLUE,
                0,0,1);
        Animal baby = new Shark ("Baby", 100.0, alex, LocalDate.now(),List.of(chumka), Color.BLUE,
                0,0,1);
        Animal leva = new Lion("Leva",85.0,alex,LocalDate.now(),List.of(chumka), Color.GRAY,
                1,0,0);
        Animal crokus = new Crocodile("Crokus", 120.0, alex, LocalDate.now(),List.of(chumka), Color.GREEN,
                1,0,1);
//        System.out.println(barsik.getName());
//        barsik.wakeUp();
//        System.out.println(barsik.getVaccinations());
        barsik.setVaccinations(List.of(chumka, new Vaccination("столбняк", LocalDate.now())));
//        System.out.println(barsik.getVaccinations());
        Dog barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE,
                1, 0, 1);
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(barbos);
        animals.add(kesha);
        animals.add(dayneris);
        animals.add(nemo);
        animals.add(baby);
        animals.add(leva);
        animals.add(crokus);
        for (Animal animal : animals) {
            animal.lifeCycle();
        }
//        ((Cat) barsik).getBreed();

    }
}

