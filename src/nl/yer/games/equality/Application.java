package nl.yer.games.equality;

import nl.yer.games.constructors.Car;

public class Application {

    public static void main(String[] args) {
        int i = 15;
        int j = 16;

        if(i == j ) {
            System.out.println("I is gelijk aan j");
        }
        else {
            System.out.println("I is ongelijk aan j");
        }

        // the dark side
        Car c = new Car(0, "AABBCC");
        Car d = new Car(0, "AABBCC");

        if( c == d) {
            System.out.println("Ze zijn gelijk");
        }
        else {
            System.out.println("De cars zijn niet gelijk");
        }


        // the gray side
        if(c.equals(d)) {
            System.out.println("De cars zijn semantisch gelijk");
        }
        else {
            System.out.println("De cars zijn semantisch ongelijk!!!");
        }
    }
}
