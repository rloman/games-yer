package nl.yer.games.interfaces;

import java.util.Comparator;

public class Philips extends Device implements Television {

    private boolean on;
    private int currentChannel;


    private int someStuff;

    public void on() {
        this.on = true;
    }

    public void off() {
        this.on = false;

    }

    public int switchChannel(int newChannel) {
       this.currentChannel = newChannel;

       return this.currentChannel;
    }
}
