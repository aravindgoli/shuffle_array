
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {
        // Create a list with values 1 to 6
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }

        // Shuffle the list
        Collections.shuffle(list);

        // Print the shuffled list
        System.out.println("Shuffled Array: " + list);
    }
}