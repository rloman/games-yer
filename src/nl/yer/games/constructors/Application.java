package nl.yer.games.constructors;

public class Application {

    public static void main(String[] args) {

        Car c = new Car("AABBCC", 60000);
        Car d = new Car(45000, "DR-73-JN");

        System.out.println(c);


        String label = "Label:" + c;
        System.out.println(label);


    }
}


