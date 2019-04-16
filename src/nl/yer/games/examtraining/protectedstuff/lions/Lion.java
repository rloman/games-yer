package nl.yer.games.examtraining.protectedstuff.lions;

import nl.yer.games.examtraining.protectedstuff.Animal;

public class Lion extends Animal {

    public void foo() {
        claws = 4;
    }

    public static void main(String[] args) {

        Lion l = new Lion();
        Animal a = new Animal();
    }


}