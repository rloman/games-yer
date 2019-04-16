package nl.yer.games.collections.garderobe;

import java.util.HashMap;
import java.util.Map;

public class Garderobe {

    private Map<Integer, Jas> wardrobe = new HashMap<>();

    private int counter = 0;


    public int enter(Jas jas) {

        this.wardrobe.put(counter, jas);
        return counter++;

    }

    public Jas leave(int number) {

//        return this.wardrobe.remove(number);

        if(this.wardrobe.containsKey(number)) {
            Jas gevondenJas = this.wardrobe.get(number);
            this.wardrobe.remove(number);
            return gevondenJas;
        }
        else {
            return new Jas("Spare Coat");
        }
    }


}
