package nl.yer.games.examtraining.exception;

public class App {

    public static void main(String[] args) {

        try {
            foo();
        }
        catch(Exception yerException) { // illegal since foo does NOT throw the CHECKED YerException

        }

        try { // legal since bar could throw every exception (even IndexOutOfBoundsException)
            bar();
        }
        catch(Exception e) {

        }

    }

    public static void foo() {

    }

    public static void bar() throws ClassCastException {

    }



}


class YerException extends Exception {

}