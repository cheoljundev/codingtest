package string;

import java.util.Scanner;

/**
 * @author cheoljundev
 * @since 2026. 2. 12.
 */
public class CaseConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        System.out.print(chars);

    }
}
