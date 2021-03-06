import java.util.Scanner;

/**
 * @author Oleg Cherednik
 * @since 13.08.2018
 */
public class Solution {

    static int maximumDraws(int n) {
        return n + 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = maximumDraws(n);
            System.out.println(String.valueOf(result));
        }
    }

}
