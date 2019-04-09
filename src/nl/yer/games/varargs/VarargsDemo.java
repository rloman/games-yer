package nl.yer.games.varargs;

public class VarargsDemo {

    public static void main(String ... args) {
        int first = VarargsDemo.demo(new int[]{1,2,3});

        System.out.println(first);

        first = VarargsDemo.demoVararg(1,2,3);

        int min = VarargsDemo.minOnhandig(5);
        System.out.println("minOnhandig:"+min);

        min = VarargsDemo.minHandig(42, 2,12,34) ;

        System.out.println("Min uit handig: "+min);

        int minDemoVraag = VarargsDemo.minHandig(3, new int[]{1,3,45});

        printNames("Suzanne", "Jolein", "Elsje");
        printNames("Raymond");
    }

    public static void printNames(String name, String... names) {

        System.out.print(name);
        for(String n: names) {
            System.out.print(", "+n);
        }
        System.out.println();

    }

    public static int minHandig(int first, int ... rest){
        int min = first;
        for(int number: rest) {
            if(number < min) {
                min = number;
            }
        }
        return min;
    }

    //assignment

    public static int minOnhandig(int ... numbers) {

        int min = numbers[0];
        if(numbers.length > 1) {
            for(int i=1;i<numbers.length;i++) {
                if(numbers[i] < min) {
                    min = numbers[i];
                }
            }
        }

        return min;

    }



    public static int demo(int[] numbers) {

        if(numbers.length > 0) {
            return numbers[0];
        }

        else {
            return Integer.MIN_VALUE;
        }

    }


    public static int demoVararg(int... numbers) {

        for(int element: numbers) {
            System.out.println(element);
        }

        return 42;

    }

}
