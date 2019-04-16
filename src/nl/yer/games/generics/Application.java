package nl.yer.games.generics;

import nl.yer.games.constructors.Car;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        //2004
        ArrayList lijst = new ArrayList(); // raw list

        lijst.add(3);

        lijst.add("Ray");

        lijst.add(new Car());

        for (Object element : lijst) {

            if (element instanceof Integer) {
                System.out.println("int: " + element);
            } else {
                if (element instanceof String) {
                    System.out.println("String: " + element);
                } else {
                    if (element instanceof Car) {
                        Car c = (Car) element;
                        System.out.println("Car" + c.getLicensePlate());
                    }
                }
            }

        }

        //2005
        {
            ArrayList<String> names = new ArrayList<String>();

            names.add("Suzanne");
            names.add("Ray");
//        names.add(3); // vout


            for (String element : names) {
                System.out.println(element);
            }

        }

        {


            // 2007 (Java 7)
            ArrayList<String> names = new ArrayList<>(); // diamond operator

            names.add("Suzanne");
            names.add("Ray");
//        names.add(3); // vout


            for (String element : names) {
                System.out.println(element);
            }

        }

        {
            ArrayList<Car> garage = new ArrayList<>();

            garage.add(new Car());
        }

        Box <Integer> numberBox = new Box<>();
        numberBox.add(3);

        Box<Boolean> booleanBox = new Box<>();
        booleanBox.add(true);




    }
}
