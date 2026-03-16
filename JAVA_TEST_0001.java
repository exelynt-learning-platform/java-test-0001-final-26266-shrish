public class JAVA_TEST_0001 {

    static final int PATTERN_SIZE = 5;

    public static void main(String[] args) {
        for (int i = 0; i < PATTERN_SIZE; i++) {
            printRow(i);
        }
        for (int i = PATTERN_SIZE - 2; i >= 0; i--) {
            printRow(i);
        }
    }

    private static void printRow(int i) {
        for (int s = 0; s < (PATTERN_SIZE - 1 - i); s++) {
            System.out.print(" ");
        }

        System.out.print("*");

        if (i > 0) {
            for (int s = 0; s < (2 * i - 1); s++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
    }
}