import java.util.HashMap;
import java.util.Map;

public class Q1Day15 {

    public static void main(String[] args) {

        String sentence =
                "Paranoids are not paranoid because they are paranoid " +
                        "but because they keep putting themselves deliberately " +
                        "into paranoid avoidable situations";

        HashMap<String, Integer> map = new HashMap<>();

        // Split words
        String[] words = sentence.toLowerCase().split(" ");

        // Count frequency
        for (String word : words) {

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Remove word "avoidable"
        map.remove("avoidable");

        System.out.println("\nAfter removing 'avoidable':");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}