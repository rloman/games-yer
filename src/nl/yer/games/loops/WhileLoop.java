package nl.yer.games.loops;

public class WhileLoop {

    public static void main(String[] args) {
        int aantalVogels = 150;

        // 0 of vaker uitgevoerd!s
        while(aantalVogels < 30) {
            System.out.println(aantalVogels++);

        }


        // 1 of vaker uitgevoerd! // soort van proeven of iets lekker is of kan!!!
        do {
            System.out.println("In de do  ... while");
            System.out.println(aantalVogels);
            aantalVogels++;
        }
        while(aantalVogels < 30);
    }
}
