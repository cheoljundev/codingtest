package string;

import java.util.Scanner;

/**
 * @author cheoljundev
 * @since 2026. 2. 11.
 */
public class FindChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().toLowerCase();
        String findChar = sc.nextLine().toLowerCase();

        int result = 0;
        for (int i = 0; i < string.length(); i++) {

            char c = string.charAt(i);
            if (c == findChar.charAt(0)) {
                result++;
            }
        }

        System.out.println(result);
    }
}
