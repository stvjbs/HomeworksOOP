package org.example;



import java.time.LocalDate;
import java.util.List;

public class Animal {
    public String name;
    public double weight;
    public Owner owner;
    public LocalDate birthDay;
    public List<Vaccination> vaccinations;
    public Color color;
    public final String TYPE = this.getClass().getSimpleName();
    public Integer canGo; // 1, if can, else 0
    public Integer canFly;  // 1, if can, else 0
    public Integer canSwim; // 1, if can, else 0

    public Animal(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations,
                  Color color, Integer canGo, Integer canFly, Integer canSwim) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
        this.birthDay = birthDay;
        this.vaccinations = vaccinations;
        this.color = color;
        this.canGo = canGo;
        this.canFly = canFly;
        this.canSwim = canSwim;
    }

    public Animal(String name, double weight, Owner owner, LocalDate birthDay, Color color, Integer canGo,
                  Integer canFly, Integer canSwim) {
        this(name, weight, owner, birthDay, null, color, canGo, canFly, canSwim);
    }

    public Animal(String name) {
        this.name = name;
    }


    public void lifeCycle() {
        wakeUp();
        if (getCanGo() == 1)
            toGo();
        if (getCanFly() == 1)
            fly();
        if (getCanSwim() == 1)
            swim();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }
    void wakeUp() {
        System.out.println(this.TYPE + " проснулся.");
    }

    void findFood() {
        System.out.println(this.TYPE + " ищет еду.");
    }

    void eat() {
        System.out.println(this.TYPE + " кушает.");
    }

    void toPlay() {
        System.out.println(this.TYPE + " играет.");
    }

    void goToSleep() {
        System.out.println(this.TYPE + " собирается спать.");
    }

    void sound() {
        System.out.println(this.TYPE + " издает звук.");
    }

    void toGo() {        System.out.println(this.TYPE + " идёт ." );    }

    void fly() {        System.out.println(this.TYPE + " летит .");    }

    void swim() {        System.out.println(this.TYPE + " плывет .");    }

    // getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Color getColor() {
        return color;
    }

    public String getTYPE() {
        return TYPE;
    }

    public Integer getCanGo() {
        return canGo;
    }

    public Integer getCanFly() {
        return canFly;
    }

    public Integer getCanSwim() {
        return canSwim;
    }
}

