package practice_basic_day02;

import java.util.Scanner;

public class Q14_StringManipulation08 {

    /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen birinci String'i giriniz: ");
        String str1 = scan.next();

        System.out.print("Lutfen ikinci String'i giriniz: ");
        String str2 = scan.next();

        if (str1.length()%2==0) {
            System.out.println(str1.substring(0, str1.length()/2) + str2 + str1.substring(str1.length()/2));
        } else {
            System.out.println("str1 cift sayili olmadigi icin ortasina yerlestiremedik.");
        }

    }
}
