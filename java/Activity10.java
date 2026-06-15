import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {

        HashSet<String> letters = new HashSet<>();

        letters.add("M");
        letters.add("B");
        letters.add("C");
        letters.add("A");
        letters.add("M");
        letters.add("X");

        System.out.println("Initial Set: " + letters);
        System.out.println("Set size: " + letters.size());

        System.out.println("Removing 'A': " + letters.remove("A"));

        if (letters.remove("Z")) {
            System.out.println("'Z' removed from set");
        } else {
            System.out.println("'Z' not found in set");
        }

        System.out.println("Contains 'M': " + letters.contains("M"));
        System.out.println("Final Set: " + letters);
    }
}