package nl.yer.games.variables.booleans;

public class Application {

    public static void main(String[] args) {

        boolean deZonSchijnt = true;
        boolean hetRegent = false;

        boolean parapluNodig = hetRegent | !deZonSchijnt;

        System.out.println(parapluNodig);

        if(deZonSchijnt) {
            System.out.println("het is mooi weer!");
        }

    }
}
