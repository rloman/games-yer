package nl.yer.games.model;

public class Game {

   private String name; // field of instance variable
   private double price; //
   private int levels = 10;


   /* default access */
   int start() { // package level access of default of package private
       levels = levels +1; // is the same as ... =>
       levels++;

       System.out.println("De game is gestart ... ");

       return levels;

   }

   public String getValue(int age) {
       if(age > 80) {
           return "Senior";
       }
       else {
           if(age < 3) {
               return "Super Junior";
           }
       }

       return "test";
   }

   public int stop() {
       levels--;

       System.out.println(--levels);
       System.out.println(levels--);

       int a = --levels;
       a = levels++;

       a += 3;// is gelijk aan => a = a +3;

       a *= 2; // is gelijk aan => a = a * 2;

       System.out.println("De game is gestopt ... ");

       int localCounter = 33;

       localCounter = -localCounter;

       return levels;

   }

   public void setLevels(int newLevels) { // newLevel krijgt hier de waarde van het doorgegeven argument
       levels = newLevels;
   }

}
