package nl.yer.games.loops.labels;

public class Application {

    public static void main(String[] args) {
        outer:
        for(int i = 0;i<5;i++) {
//            System.out.println(i);
            for(int j = 0;j<5;j++) {
                if(j == 3 ) {
                    break outer;
                }
                System.out.println(i+"x"+j+"="+i*j);
            }
        }
    }
}
