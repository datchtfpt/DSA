package HashTable.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Da Nang");
        set.add("Ha Nam");
        set.add("Da Nang");
        set.add("Ha Nam");

        System.out.println(set);

        System.out.println("Check set co value: " + set.contains("Da Nang"));

        Set<String> set2 = new HashSet<>(Arrays.asList("Ha Noi", "Quang Nam", "Da Nang"));

        set.addAll(set2);

        System.out.println(set);



    }
}
