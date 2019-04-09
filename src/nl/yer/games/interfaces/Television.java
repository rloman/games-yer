package nl.yer.games.interfaces;

public interface Television {

     /* public static final */
      int VATPERCENTAGE= 15;

     void on();
     void off();
     int switchChannel(int newChannel);

     default void plugCord() {

     }

}
