package nl.yer.games.inheritance;

import java.util.List;

public final class AnimalFeeder {

    public static void feedAnimals(List<Animal> hungryAnimals) {

        for(Animal animal: hungryAnimals) {

            animal.eat();

            // casting is simply said a pretty bad practise
            if(animal instanceof Lion) {
                Lion aLion = (Lion) animal;
                aLion.roar();
            }

            long aLongNumber = 93483948394L;

            System.out.println(aLongNumber);

            int smaller = (int)  aLongNumber;

            printInt(smaller);



        }

    }

    public static void printInt(int i) {
        System.out.println(i);
    }

    private AnimalFeeder() {

    }
}
