package nl.yer.games.inheritance;

import nl.yer.games.access.Person;

public abstract class Mammal extends Animal {

    private boolean hasFur;

    private int teeth;

    public Mammal(String name) {
        super(name);
    }

    public Mammal(String name, boolean hasFur) {
        super(name);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public abstract Object sound();

    @Override
    public String toString() {
        return "Mammal{" +
                "hasFur=" + hasFur +
                "} " + super.toString();
    }
}
