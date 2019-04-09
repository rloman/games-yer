package nl.yer.games.inheritance;

public class Cub extends Lion {

    public Cub(String name) {
        super(name);
    }

    @Override
    public Integer sound() {
        System.out.println("Sounding Cub");

        return 42;
    }
}
