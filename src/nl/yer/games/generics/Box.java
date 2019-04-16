package nl.yer.games.generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T> inhoud = new ArrayList<T>();


    public void add(T n) {
        this.inhoud.add(n);
    }
}
