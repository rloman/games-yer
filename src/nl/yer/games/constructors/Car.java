package nl.yer.games.constructors;

public class Car {

    private int id;
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

    public Car(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {

        if (o instanceof Car) {

            Car other = (Car) o;

            return this.getLicensePlate().equals(other.getLicensePlate())
                    && this.mileage == other.mileage;

        } else {
            return false;
        }


    }

    @Override
    public int hashCode() {
        return licensePlate != null ? licensePlate.hashCode() : 0;
    }

    // this is a "callback" method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Car met id: " + this.id + " wordt opgeruimd ...");
    }
}
