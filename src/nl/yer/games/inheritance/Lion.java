package nl.yer.games.inheritance;

public class Lion extends Mammal {

    private int teeth;

    public Lion(String name) {
        super(name);
        this.setHasFur(true);
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public void roar() {
        System.out.println("Roaring Lion ... ");
    }

    @Override
    public Integer sound() {
        System.out.println("Sounding lion ... ");

        return 52;

    }

    @Override
    public String toString() {
        return "Lion{" +
                "teeth=" + teeth +
                "} " + super.toString();
    }

    @Override
    public void eat() {

        System.out.println("Eating lion ... ");

    }
}
