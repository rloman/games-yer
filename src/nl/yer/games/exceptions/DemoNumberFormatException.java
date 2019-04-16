package nl.yer.games.exceptions;

public class DemoNumberFormatException {

    public static void main(String[] args) {

        String ageAsString = "monkey";

//        int myage = Integer.parseInt(ageAsString);

//        System.out.println(myage+2);

        System.out.println(isNumeric(ageAsString));
    }

    public static boolean isNumeric(String value) {
        try {
            Integer.parseInt(value);
            return true;
        }
        catch(NumberFormatException nfe) {
            return false;
        }
    }
}
