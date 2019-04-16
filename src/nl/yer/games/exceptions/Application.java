package nl.yer.games.exceptions;

import nl.yer.games.constructors.Car;
import nl.yer.games.inheritance.Animal;
import nl.yer.games.inheritance.Cub;
import nl.yer.games.inheritance.Zebra;

public class Application {

    private static String firstName;

    public static void main(String[] args) {

        try {
            System.out.println(divide(6, 2));
        } catch (YerUnableToDivideByZeroException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(divide(6, 0));
        } catch (YerUnableToDivideByZeroException e) {
            e.printStackTrace();
        }

        System.out.println("Succesvol einde programma!");

//        System.out.println(firstName.length());

        int[] numbers = {1,2,3};
        for(int i = 0;i<numbers.length;i++) {
            System.out.println("numbers[i] is:"+numbers[i]);
        }

        Animal c = new Cub("Cuppie");
        Zebra auto = (Zebra) c;

    }

    public static int divide(int a, int b) throws YerUnableToDivideByZeroException {

        try {
            return a / 3;
        }
        catch(ArithmeticException ae) {
            throw new YerUnableToDivideByZeroException();
        }

    }
}
