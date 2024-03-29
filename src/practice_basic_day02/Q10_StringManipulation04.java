package practice_basic_day02;

import java.util.Scanner;

public class Q10_StringManipulation04 {
    /*
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String str = scan.next();

        if (str.length() >=3) {
            System.out.println(str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2));
        } else {
            System.out.println(str);
        }

    }
}
