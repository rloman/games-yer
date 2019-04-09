package nl.yer.games.inheritance;

import java.util.LinkedList;

public class ApplicationFeeder {

    public static void main(String[] args) {

        LinkedList<Animal> animals = new LinkedList<>();

        animals.add(new Lion("Simba"));
        animals.add(new Cub("Wolfy"));
        animals.add(new Zebra("Zep"));

        AnimalFeeder.feedAnimals(animals);
    }
}
