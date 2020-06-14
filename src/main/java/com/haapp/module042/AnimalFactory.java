package com.haapp.module042;

public class AnimalFactory {

    public static Animal create(String animal) throws NoSuchAnimalException {
        switch(animal.toLowerCase()) {
            case "cow":
                return new Cow();
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            default: throw new NoSuchAnimalException("Sorry? there is no an animal " + animal);
        }
    }

}
