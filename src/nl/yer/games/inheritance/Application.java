package nl.yer.games.inheritance;

public class Application {

    public static void main(String[] args) {

        Lion simba = new Lion("Simba");

        simba.sound();

        System.out.println(simba.toString());


        //demo abstract class

        Lion lion = new Lion("simba");
    }
}
