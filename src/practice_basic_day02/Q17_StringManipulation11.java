package practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String name = scan.next();

        System.out.print("Lutfen soyisminizi giriniz: ");
        String lastName = scan.next();

        if (name.length() > lastName.length()) {
            System.out.println("İsminiz soyisminizden daha uzun. İsminizin uzunluğu: " + name.length() + ", Soyisminizin uzunluğu: " + lastName.length());
        } else {
            System.out.println("İsminiz soyisminizden daha kısa. İsminizin uzunluğu: " + name.length() + ", Soyisminizin uzunluğu: " + lastName.length());
        }

    }

}
