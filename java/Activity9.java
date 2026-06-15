import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        fruits.add(3, "Grapes");
        fruits.add(1, "Papaya");

        System.out.println("All items in the list:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("3rd element in the list: " + fruits.get(2));
        System.out.println("Is 'Chikoo' present: " + fruits.contains("Chikoo"));
        System.out.println("Size of list: " + fruits.size());

        fruits.remove("Papaya");

        System.out.println("Size after removal: " + fruits.size());
    }
}