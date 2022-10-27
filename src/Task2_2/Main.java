package Task2_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new LinkedHashMap<>();
        mapa.put(1, "first");
        mapa.put(2, "second");
        mapa.put(3, "third");
        mapa.put(4, "fourth");
        mapa.put(5, "fifth");
        mapa.put(6, "sixth");
        mapa.put(7, "seventh");
        mapa.put(8, "eighth");
        mapa.put(9, "ninth");
        mapa.put(10, "tenth");
        System.out.println(mapa);
        System.out.println();
        for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
            System.out.println(entry);
        }

    }
}
