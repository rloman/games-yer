package nl.yer.games.gc;

import nl.yer.games.constructors.Car;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        foo();

        for(int i = 0;i<10_000_000;i++) {
            System.out.println(i);

            // Hier gebeurt nog veel werk en dat duurt nog uren ...
//            System.gc();'
            Thread.sleep(10);
        }
    }


    public static void foo() {
        int i = 3;

        for(int j = 4;j<2500;j++) {
            Car c = new Car(j);
        }
        // de Car(s) zijn nu niet meer te benaderen!

    }
}
