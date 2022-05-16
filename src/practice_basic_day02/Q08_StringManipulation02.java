package practice_basic_day02;

import java.util.Scanner;

public class Q08_StringManipulation02 {

    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("String 1: ");
        String str1 = scan.nextLine();

        System.out.println("String 2: ");
        String str2 = scan.nextLine();

        System.out.println(str1.concat(" " + str2));

        String str1Ilksiz = str1.substring(1);
        String str2Ilksiz = str2.substring(1);
        System.out.println(str1Ilksiz + " " + str2Ilksiz);

    }
}
