import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Collect {
    public static void main(String[] args) {
        // Ready-made data structure (List)
    	ArrayList<String> nameList = new ArrayList<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Add names to the list
        System.out.println("Enter names (type 'exit' to stop):");
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            nameList.add(name);
        }

        // Displaying the original list
        System.out.println("Original List:");
        displayList(nameList);

        // Using a ready-made algorithm for sorting
        Collections.sort(nameList);

        // Displaying the sorted list
        System.out.println("\nSorted List:");
        displayList(nameList);

        // Iterating through the list using enhanced for loop
        System.out.println("\nIterating through the list:");
        for (String name : nameList) {
            System.out.println(name);
        }
    }

    // Utility method to display a list
    private static void displayList(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}