package practice_basic_day02;

import java.util.Scanner;

public class Q13_StringManipulation07 {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir String giriniz: ");
        String str = scan.next();

        String contained = str.contains("xyz") ? ("true") : ("false");
        System.out.println(contained);

    }
}
