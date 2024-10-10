import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A"); // Duplicate

        // Display elements
        System.out.println("Set: " + set); // Duplicates are ignored
    }
}
