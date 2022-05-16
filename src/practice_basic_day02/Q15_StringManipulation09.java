package practice_basic_day02;

import java.util.Scanner;

public class Q15_StringManipulation09 {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen biri String giriniz: ");
        String str1 = scan.next();

        if (str1.length() >= 3 && !(str1.length() % 2 == 0)) {
            String strEdited = str1.substring(str1.length() / 2, str1.length() / 2 + 1);
            System.out.println(strEdited);
        } else {
            System.out.println("Lutfen 3 veya daha fazla tek sayida kelime girin.");
        }

    }
}