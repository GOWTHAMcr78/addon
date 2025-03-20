import java.util.*;

public class Insertionofnumbers {
    public static void main(String[] args) {
        // Initialize the list with given elements
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        
        // Insert 777 at the beginning (index 0)
        list.add(0, 777);
        
        // Insert 333 at position 4 (original list index 3, now shifted due to first insertion)
        list.add(4, 333);
        
        // Display the list
        System.out.println(list);
    }
}