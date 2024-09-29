package Map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("prasant", 1);
        map.put("kartik", 2);
        map.put("piyush", 4);
        map.put("shivani", 5);
        System.out.println(map.size());
        System.out.println(map.get("prasant"));
        System.out.println(map.containsKey("kartik"));
        System.out.println(map.containsKey("Anu"));
        System.out.println(map.remove("piyush"));
        System.out.println(map.containsKey("piyush"));
        System.out.println(map.size());
        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));
        }

    }
}
