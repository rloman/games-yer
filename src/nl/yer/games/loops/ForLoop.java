package nl.yer.games.loops;

public class ForLoop {

    public static void main(String[] args) {
        for (int i = 1; i < 2000; i++) {
            if (i == 13) {
                continue;
            }
            if (i == 115) {
                break;
            }
            System.out.println(i);
        }

        // straks ... loop van 0 tot en met 15 en druk alle even getallen af
        for (int i = 0; i <= 15; i += 2) {
//            System.out.println(i);
        }


        int[] haystack = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

        System.out.println("Should be 8:"+haystack[6]);



        // enhanced for
        for(int needle : haystack) {
            System.out.println(needle);
        }

        // basic for (moelijker1!)
        for(int index = 0;index < haystack.length;index++) {
            System.out.println("Via Basic for loop:"+haystack[index]);
        }

    }
}
