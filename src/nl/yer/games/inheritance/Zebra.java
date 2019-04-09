package nl.yer.games.inheritance;

public class Zebra extends Mammal {

    public Zebra(String name) {
        super(name);
    }

    @Override
    public Object sound() {
       return "Sounding Zebra ... ";
    }

    @Override
    public void eat() {

        System.out.println("Eating zebra ... ");

    }


}
