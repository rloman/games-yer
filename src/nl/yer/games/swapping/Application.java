package nl.yer.games.swapping;

public class Application {

    public static void main(String[] args) {

        swimDemo();
        System.exit(0);

        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1); // 1
        System.out.println(original2); // 2

        Zwemmer a = new Zwemmer();
        a.name="a";
        Zwemmer b = new Zwemmer();
        b.name="b";

        swap(a,b);

        System.out.println(a.name);
        System.out.println(b.name);


    }

    public static void swimDemo() {
        Zwemmer z = new Zwemmer();

        z.swim();
        short korteAfstand = 3;
        z.swim(korteAfstand);
        z.swim(1000000000);

        System.out.println(z.getMileage());
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }

    public static void swap(Zwemmer a, Zwemmer b) {

        a.name="b";
        b.name="a";

    }
}


class Zwemmer {

    public String name;


    private int mileage;

    public int getMileage() {
        return mileage;
    }

    public void swim() {
        System.out.println("In de standaard swim");

        this.mileage++;

    }

    public void swim(short mileage) {
        System.out.println("In de short swim");

       this.mileage += mileage;

    }

    public void swim(int mileage) {

        System.out.println("In de int swim");

        this.mileage += mileage;


    }




}
