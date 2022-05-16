package interview_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q01 {

    //  PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
    // ve tüm öğeleri ArrayList'ten Set'e ekleyin

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

    // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
    // ve tüm karakterleri sete ekleyin

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);
        arrList.add(40);
        arrList.add(50);
        System.out.println("ArrList = " + arrList); // [10, 20, 30, 10, 40, 50]

        Set<Integer> set = new HashSet<>();
        System.out.println("set = " + set); // []

        arrListtenSeteDonustur(arrList, set);

        // bolum -2
        Set<Character> charSet = new HashSet<>();
        karakterleriSeteEkle(charSet, 'A', 'B', 'R', 'r', 'q');

        System.out.println("Charlar sete eklendikten sonra set = " + charSet); // [A, q, B, R, r]

    }

    private static void karakterleriSeteEkle(Set<Character> charSet, Character... chars) {
        for (int i = 0; i < chars.length; i++) {
            charSet.add(chars[i]);
        }
    }

    private static void arrListtenSeteDonustur(ArrayList<Integer> arrList, Set<Integer> set) {

        for (Integer i : arrList) {
            set.add(i);
        }
        // her element unique olduğu için tekrar eden elemanı görünce eskisini silip yenisini yazdı
        System.out.println("Set son hal = " + set); // [50, 20, 40, 10, 30]

    }

}
