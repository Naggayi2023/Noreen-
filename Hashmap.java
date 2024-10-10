import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Access a value
        System.out.println("Value for 'Two': " + map.get("Two"));

        // Display all key-value pairs
        System.out.println("Map: " + map);
    }
}
