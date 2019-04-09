package nl.yer.games.strings;

public class Application {


    public static void main(String[] args) {
        Car c = new Car(3.5);

        Car e = new Car(3.5);

        String s = new String();

        System.out.println(s);

        String andere = "Andere";

        String andereAndere = andere + s;

        System.out.println(c.getMileAge());


        Car d = new Car(3.5);
        d.setMileAge(10000);


    }

}


class Car {

    public Car(double d) {

    }

    private int mileAge;
    private int leeftijdVanMijnHuisdier;

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public int getLeeftijdVanMijnHuisdier() {
        return leeftijdVanMijnHuisdier;
    }

    public void setLeeftijdVanMijnHuisdier(int leeftijdVanMijnHuisdier) {
        this.leeftijdVanMijnHuisdier = leeftijdVanMijnHuisdier;
    }
}


class KameelMetTweeBulten {

}