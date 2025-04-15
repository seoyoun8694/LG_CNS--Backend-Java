package ch15;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("img", "a.jpg");
        map.put("shopName", "통아구찜");
        map.put("rating", "4.6");
        map.put("distance", "314");
        list.add(map);

        map = new HashMap<>();
        map.put("img", "b.jpg");
        map.put("shopName", "소래포구회직판장");
        map.put("rating", "-");
        map.put("distance", "338");
        list.add(map);

        System.out.println(list);
    }
}
