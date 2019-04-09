package nl.yer.games.polymorfism;

import nl.yer.games.inheritance.Animal;
import nl.yer.games.inheritance.Cub;
import nl.yer.games.inheritance.Lion;
import nl.yer.games.inheritance.Mammal;

public class Application {


    public static void main(String[] args) {
        Animal a = new Lion("Simba");

        Mammal b = new Lion("Sambo");

        Object o = new Lion("Frans");


        System.out.println(a.getName());

        System.out.println(a.getWeight());

        b.sound();


        Mammal c = new Cub("Welpje");
        c.sound();






    }
}
