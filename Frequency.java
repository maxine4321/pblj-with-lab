import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Frequency {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(2);

        // Use a HashSet to find unique elements in the ArrayList
        HashSet<Integer> uniqueElements = new HashSet<>(numbers);

        // Calculate and print the frequency of each unique element
        for (int element : uniqueElements) {
            int frequency = Collections.frequency(numbers, element);
            System.out.println("Frequency of " + element + " in the ArrayList: " + frequency);
        }
    }
}
