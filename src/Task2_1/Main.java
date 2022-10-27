package Task2_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        Service list = new Service();
        map.put("first", list.generateList());
        map.put("second", list.generateList());
        map.put("third", list.generateList());
        map.put("fourth", list.generateList());
        map.put("fifth", list.generateList());
        System.out.println(map);
        Map<String, Integer> map2 = new HashMap<>();

        for (Map.Entry<String, List<Integer>> stringList : map.entrySet()) {
            map2.put(stringList.getKey(), stringList.getValue().get(0) + stringList.getValue().get(1) + stringList.getValue().get(2));
        }

        for (Map.Entry<String, Integer> stringList : map2.entrySet()) {
            System.out.println(stringList);
        }
    }

    public static class Service {
        public List<Integer> generateList() {
            List<Integer> integerList = new ArrayList<>(3);
            Random random = new Random();
            for (int i = 0; i < 3; i++) {
                integerList.add(random.nextInt(1000));
            }
            return integerList;

        }

    }
}
