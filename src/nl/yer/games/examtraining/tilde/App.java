package nl.yer.games.examtraining.tilde;

public class App {

    public static void main(String[] args) {
        int a = 5; // five is: 00000101
        int b = ~a; // b = (-a)-1 ALWAYS

        System.out.println(b);

        b = ~b;

        System.out.println(b);
    }
}
