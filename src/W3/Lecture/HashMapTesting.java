package W3.Lecture;

import java.util.HashMap;

public class HashMapTesting {
    public static void main(String[] args) {
        // HashMap
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // Access an item
        System.out.println(capitalCities.get("England"));

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

    }
}
