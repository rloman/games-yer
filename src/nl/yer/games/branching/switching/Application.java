package nl.yer.games.branching.switching;

public class Application {

    public static void main(String[] args) {

        int age = 100;


       switch (age) {

           default : {
               System.out.println("Andere waarde");

           }
           case 1: {
               System.out.println("age = 1");

               break;
           }

           case 2: {
               System.out.println("age = 2");
               break;
           }

           case 3: {
               System.out.println("age = 3");
               break;
           }

           case 6: {
               System.out.println("age = 6");

               break;
           }


       }
    }
}
