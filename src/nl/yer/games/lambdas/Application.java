package nl.yer.games.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(0, 1, 1, 3, 5, 8, 13, 21, 34, 55));

        System.out.println(numbers);

        System.err.println("Nu alleen de even getallen");
        numbers.stream().filter(n -> n % 2 == 0).forEach(n -> {
            System.out.println(n);
        });

        System.out.println("Nu alleen de even getallen > 5");

        numbers.stream().filter(b -> b % 2 == 0).filter(n -> n > 5).forEach(n -> {
            System.out.println(n);
        });

        System.out.println("Nu allleeen van alle oneven getallen de kwadraten");

        numbers.stream().filter(n -> n % 2 != 0).map(n -> n * Math.pow(n, 2)).forEach(n -> {
                    System.out.println(n);
                }
        );


        System.out.println("Nu allleeen van alle oneven getallen vermenigvuldiging met PI (3.141592653589");

        numbers.stream().filter(n -> n % 2 != 0).map(n -> n * Math.PI).forEach(n -> {
                    System.out.println(n);
                }
        );

        long aantalOnevenGetallen = numbers.stream().filter(n -> n %2 == 1).count();

        System.out.println(aantalOnevenGetallen);



        System.out.println("Nu alleen de even getallen > 5 en dan weer terug naar de oorspronkelijke lijst (dus destructive)");

        numbers = numbers.stream().filter(b -> b % 2 == 0).filter(n -> n > 5).collect(Collectors.toList());

        System.out.println(numbers);





    }
}
