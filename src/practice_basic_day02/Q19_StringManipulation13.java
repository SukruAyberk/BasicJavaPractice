package practice_basic_day02;

import java.util.Scanner;

public class Q19_StringManipulation13 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir String giriniz: ");
        String str = scan.next();

        if (str.length() < 3 && str.length() > 5) {
            System.out.println("Lutfen 4 harfli bir kelime girin.");
        } else {
            System.out.println(str.substring(3) + str.substring(2, 3) + str.substring(1, 2) + str.substring(0, 1));
        }

    }
}
