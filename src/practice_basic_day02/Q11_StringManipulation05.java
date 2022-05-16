package practice_basic_day02;

public class Q11_StringManipulation05 {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {

        String str1 = "cesaret", str2 = "insana", str3 = "sinirlarini", str4 = "ogretir";


        System.out.println(str1.substring(0, 1).toUpperCase() + str1.substring(1) + " " + str2 + " " + str3 + " " + str4 + ".");

    }
}
