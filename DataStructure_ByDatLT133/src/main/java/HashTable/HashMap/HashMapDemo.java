package HashTable.HashMap;

import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("Ha Noi",29);
        map.put("Ha Tay",30);
        map.put("Nghe An",37);
        map.put("Ha Tinh",38);
        map.put("Da Nang",43);
        map.put("Da Nang 2",92);

        map.putIfAbsent("Da Nang",43);

        System.out.println("Bien so xe Da Nang: " + map.get("Da Nang"));
        System.out.println("Bien so xe Da Nang 2: " + map.get("Da Nang 2"));

        System.out.println("Kiem tra chua key: " + map.containsKey("Da Nang"));
        System.out.println("Kiem tra chua key: " + map.containsKey("Ha Nam"));
        System.out.println("Kiem tra chua value: " + map.containsValue(38));

        map.remove("Ha Nam");
        map.remove("Da Nang", 44); // pair of key and value -> have to match both key and value

        //map.clear();

        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        for(Integer val : map.values()){
            System.out.print(val + " ");
        }
        System.out.println();

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map);

    }
}
