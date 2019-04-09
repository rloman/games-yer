package nl.yer.games.arrays;

public class Application {

    public static void main(String[] args) {

        {
            int[] numbers = new int[3];
        }

        {
            int[] numbers = new int[]{1, 2, 3};
        }

        // dit is hetzelfde resultaat
        {
            int[] numbers = {1, 2, 3};
        }

        {
            // C style
            int numbers[] = {1, 2, 3};
        }

        {

        }

        {
            int[][][] kubus = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                    {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                    {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}};
        }


    }
}
