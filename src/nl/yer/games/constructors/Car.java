package nl.yer.games.constructors;

public class Car {

    private int mileage;
    private String licensePlate;
    private PetrolTank petrolTank = new PetrolTank(10, 45);

    public Car(String licensePlate, int mileage, int maxLevel, int minLevel) {
        this.licensePlate = licensePlate;
        this.mileage = mileage;
        this.petrolTank = new PetrolTank(minLevel, maxLevel);
    }

    public Car(int mileage, String licensePlate) {
        this.mileage = mileage;
        this.licensePlate = licensePlate;
    }

    public Car() {

    }

    public Car(String aabbcc, int i) {

    }


    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String toString() {
        return "Car {" +
                "licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
