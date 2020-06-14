package com.haapp.module042;

public class AnimalHandler<T extends Animal> {

    private T animal;

    public AnimalHandler(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void speak() {
        animal.say();
    }
}
