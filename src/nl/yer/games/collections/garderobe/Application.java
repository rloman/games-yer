package nl.yer.games.collections.garderobe;

public class Application {

    public static void main(String[] args) {

        Garderobe g = new Garderobe();

        Jas jas = new Jas("Jordi");

        int receivedNumber = g.enter(jas);

        // wandelen en zo ... in de disco


        // kommmm ik drieee uur later terug

        jas = null;



        jas = g.leave(receivedNumber);




    }
}
