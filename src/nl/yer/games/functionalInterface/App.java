package nl.yer.games.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(0,1,1,2,3,5,8,13,21,34,55);

        // onhandig
        numbers.stream().filter(new MyEvenNumberPredicate()).forEach(n -> {
            System.out.println(n);
        });

        // onhandig
        numbers.stream().filter(new MyEvenNumberPredicate()).forEach(n -> {
            System.out.println(n);
        });

        // complex
        numbers.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        }).forEach(n -> {
            System.out.println(n);
        });

        // handig
        numbers.stream().filter(n -> n %2 == 0).forEach(n -> {
            System.out.println(n);
        });
    }

}

@FunctionalInterface
interface YerRunner  {

    boolean run();

    default boolean itRocks() {

    }
}


class MyEvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer n) {

        return n % 2 == 0;
    }
}