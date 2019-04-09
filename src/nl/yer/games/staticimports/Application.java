package nl.yer.games.staticimports;

import java.util.Random;

import static java.lang.Math.*;

public class Application {

    public static void main(String[] args) {


        // normal
        System.out.println(Math.PI);

        // using static import

        System.out.println(PI);


        System.out.println(random() * 1000);

        System.out.println(E);

        System.out.println(sin(45));

        System.out.println(new Random().nextInt(100));






    }
}
