package interview_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Q03_CollectionsMethodsTask {

    // part 1: create list of 5 numbers from user input
// sort the list in reverse order and print it
// shuffle the list and print it
// rotate right by 3 places and print it

// bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
// listeyi ters sırada sırala ve yazdır
// listeyi karıştır ve yazdır
// 3 yer sağa döndür ve yazdır

// part 2: find the max number and min number, print them
// replace all max number with min number

// bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
// tüm maksimum sayıları minimum sayı ile değiştir

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". sayıyı gir: ");
            list.add(scan.nextInt());
        }


        Collections.sort(list, Collections.reverseOrder()); // [5, 4, 3, 2, 1] sort methodu ile reverseOrder() methoduna erişebildik ters sıraladık yani
        System.out.println("Ters sıraladıktan sonra list = " + list);
        Collections.shuffle(list);
        System.out.println("Karıştırdıktan sonra list = " + list); // [4, 2, 3, 1, 5]
        Collections.rotate(list, 3);
        System.out.println("3 birim kaydıktan sonra list = " + list); // [3, 1, 5, 4, 2]

        /*
        int maxSayi = Integer.MIN_VALUE;
        int minSayi = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= maxSayi) {
                maxSayi = list.get(i);
            } else {
                minSayi = list.get(i);
            }
        }

        Eskiden bu şekilde yapardık artık buna gerek kalmadı
         */
        Integer maxSayi = Collections.max(list);
        Integer minSayi = Collections.min(list);

        System.out.println("Maksimum sayı = " + maxSayi); // 5
        System.out.println("Minimum sayı = " + minSayi); // 1

        Collections.replaceAll(list, maxSayi, minSayi);
        System.out.println("Maksimumla minimum değiştikten sonra list = " + list); // [3, 1, 1, 4, 2]


    }
}
