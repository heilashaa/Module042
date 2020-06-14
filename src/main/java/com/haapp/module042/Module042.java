package com.haapp.module042;

import java.util.Scanner;

public class Module042 {

    private static final String SEPARATOR_LINE = "------------------------------------------------------------------";

    public static void main(String[] args) {

        separate();
        System.out.println("Please, type an animal (dog, cat, cow) and press ENTER:");

        try (Scanner in = new Scanner(System.in)) {

            String inComeLineFromConsole = in.nextLine();

            AnimalHandler<Animal> animalHandler = new AnimalHandler<>(AnimalFactory.create(inComeLineFromConsole));
            animalHandler.speak();

        } catch (NoSuchAnimalException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void separate() {
        System.out.println(SEPARATOR_LINE);
    }
}
