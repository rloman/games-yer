package nl.yer.games.access;

public class Person {


    public static void main(String[] args) {
        Person p = new Person();
        p.age = 45;
        p.demo(3);
    }

    private int age;

    public void demo() {
        Person other = new Person();

        other.age = 45;

        Child kind = new Child();
        System.out.println(kind.getSpeelgoed());

    }

    public void demo(int n) {



    }

    public boolean equals(Person p) {
        return p.age == this.age;
    }
}

class Child {

    int speelgoed;

    public  int getSpeelgoed() {
        return speelgoed;
    }

}
