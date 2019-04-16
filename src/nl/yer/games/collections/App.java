package nl.yer.games.collections;

import java.util.*;

public class App {

    public static void main(String[] args) {

        //list
        List<String> names = new ArrayList<>();
        names.add("Mohamed");
        names.add(0, "Tomas");

        System.out.println(names);

//        names = new LinkedList<>();
        names.add("Suzanne");
        names.add(0, "Jolein");

        System.out.println(names);

        //
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(0, 1, 1, 2, 33, 44, 65, 77, 8, 33));

        System.out.println(numbers);
        // Sorting
        System.out.println("Unsorted:" + names);
        Collections.sort(names);

        System.out.println("  Sorted:" + names);

        // Finally ... the Map // Garderobe // (later) Database

        Map<Integer, Player> team = new HashMap<>();
        team.put(1, new Player("Rick"));
        team.put(3, new Player("Mariska"));
        team.put(5, new Player("Fernon"));
        team.put(2, new Player("Mohamed"));

        printPlayer(3, team);

        Player somePlayer = team.get(5);

        System.out.println(somePlayer);
    }

    public static void printPlayer(int rugNummer, Map<Integer, Player> team) {
        System.out.println(team.get(rugNummer));
    }
}

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}