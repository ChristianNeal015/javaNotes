package chapter12;

import java.util.HashMap;
import java.util.Map;

public class FruitMap {
    public static void main(String[] args) {
        Map fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size());//4
        System.out.println(fruitCalories);

        System.out.println(fruitCalories.get("lemon"));//17

        System.out.println(fruitCalories.entrySet());

        fruitCalories.remove("orange");
        System.out.println(fruitCalories);//{banana=105, apple=95, lemon=17}
    }
    /**
     * Of Key Word
     * Map map = Map.of("apple", 95, "lemon", 20);
     * map.remove("apple");
     * map.put("banana", 105);
     */
}
