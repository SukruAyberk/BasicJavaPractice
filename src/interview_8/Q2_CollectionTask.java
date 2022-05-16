package interview_8;

import java.util.ArrayList;

public class Q2_CollectionTask {

    public static void main(String[] args) {

        // Create 2D ArrayList which can store String ArrayLists
        // Create 3 ArrayLists which are Employees, Employers, Companies
        // Store this 3 ArrayList in 2D ArrayList

        // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
        // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
        // Bu 3 ArrayList'i 2D ArrayList'te saklayın

        ArrayList<ArrayList<String>> listeler = new ArrayList<>(); // 2D arraylist
        ArrayList<String> calisanlar = new ArrayList<>();
        calisanlar.add("Ayberk");
        calisanlar.add("Gamze");
        calisanlar.add("Selçuk");
        calisanlar.add("Recep");

        System.out.println("Calisanlar = " + calisanlar);

        ArrayList<String> isVerenler = new ArrayList<>();
        isVerenler.add("Haluk");
        isVerenler.add("Mehmet");
        isVerenler.add("Murat");
        isVerenler.add("Yusuf");
        isVerenler.add("Can");

        ArrayList<String> sirketler = new ArrayList<>();
        sirketler.add("Amazon");
        sirketler.add("Google");
        sirketler.add("Testinium");
        sirketler.add("IBM");

        listeler.add(calisanlar);
        listeler.add(isVerenler);
        listeler.add(sirketler);

        System.out.println(listeler); // [[Ayberk, Gamze, Selçuk, Recep], [Haluk, Mehmet, Murat, Yusuf, Can], [Amazon, Google, Testinium, IBM]]
    }
}
