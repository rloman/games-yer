package nl.yer.games.constructorchaining;

public class Kart {

    public static final int WHEELS = 4;
    public static double BTWPERCENTAGE = 21.0;

    private final String brand;
    private int cc;
    private int weight;

    private int benzine = 45;

    public static void main(String[] args) {
        Kart k = new Kart();
        System.out.println(k);
    }


    public static int counter = 0;

    public Kart() {
        counter++;
        this.brand ="Yamaha";
    }


    public Kart(String brand){
        this.brand = brand;
    }

    public Kart(int weight, boolean setWeight) {
        this("Yamaha");
        this.weight = weight;
    }

    public Kart(int cc) {
        this("Yamaha");
        this.cc = cc;

    }

    public String getBrand() {
        return brand;
    }

    public void demoFinalLocalVariable() {
        final int ccLocal = 45;
//        ccLocal++; // vout
    }

    // cannot change the value of this.brand since it is final
    public void setBrand(String brand) {
//        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Kart{" +
                "brand='" + brand + '\'' +
                ", cc=" + cc +
                ", weight=" + weight +
                ", "+Constants.GASOLINE+":"+this.benzine+
                '}';
    }
}
