package interview_8;

import java.util.*;

public class Q04_MapTask {

    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul

    public static void main(String[] args) {

        // key string, value arrlist
        HashMap<String, ArrayList<String>> groupName = new HashMap<String, ArrayList<String>>();
        ArrayList<String> devTeam = new ArrayList<String>(Arrays.asList("Ali", "Ahmet", "Ayşe"));
        ArrayList<String> qaTeam = new ArrayList<String>(Arrays.asList("Ayberk", "Recep", "Ozan", "Ramazan"));

        groupName.put("Dev Team", devTeam);
        groupName.put("QA Team", qaTeam);

        System.out.println(groupName); // {grup1=[Ali, Ahmet, Ayşe], grup2=[Ayberk, Recep, Ozan, Ramazan]}

        // for(1. yol) ile size bulunabilir ya da aşağıdaki(2. yol) yöntem kullanılabilir
        System.out.println("Dev grupta toplam " + groupName.get("Dev Team").size() + " üye bulunmaktadır");
        System.out.println("QA grupta toplam " + groupName.get("QA Team").size() + " üye bulunmaktadır");

        // alternatif ama uğraştırıcı yol (3. yol)
        Set<String> keys = groupName.keySet();
        for (String i : keys) {
            ArrayList<String> groupList = groupName.get(i);

            // Gruptaki üye sayısı : Dev Team 3
            // Gruptaki üye sayısı : QA Team  4
            System.out.println("Gruptaki üye sayısı : " + i + " " + groupList.size());
        }


    }
}
