package nl.yer.games.statics;

import java.time.LocalDate;

public class Koala {

    public static int count;


    static {
        count = 5;
        System.out.println("Counter set to 5");
    }

    static {
        System.out.println("We are now using the Koala class");
    }

    {
        name ="John Doe";
        System.out.println("Name is set to John Doe");
    }

    {
        System.out.println("Last initialisation block!");
    }

    private String name;
    private int age;

    public Koala() {
        count++;
        System.out.println("Einde constructor");

        System.out.println("Expected: 6, and is:"+Koala.count);
    }


    public static void main(String[] args) {
        Koala k1 = new Koala();

        System.exit(0);


        Koala k2 = new Koala();
        Koala k3 = new Koala();

        System.out.println(Koala.count);

        System.out.println(k1.count);

//        System.out.println(Koala.name); // vout
        System.out.println(k1.name);

        demonullTester();
        demoLocalDate();
    }

    public static void demoMathClass() {


        System.out.println(Math.PI);

    }


    public static void demoLocalDate() {
        LocalDate d = LocalDate.now();

        System.out.println(d);
    }


    public static void demonullTester() {
        Koala k4 = null;

        k4 = new Koala();

        k4 = null;


        System.out.println(k4.count);
    }

}
