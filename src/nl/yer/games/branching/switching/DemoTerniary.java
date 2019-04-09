package nl.yer.games.branching.switching;

public class DemoTerniary {

    public static void main(String[] args) {
        int levels = 45;

        String category = levels > 40 ? "Professional" : "Keep on playing!";


        category = levels > 40 ? "Professional"
                   : levels > 30 ? "Medior"
                   : levels > 20 ? "Bijna medior" : "Junior";
    }
}
