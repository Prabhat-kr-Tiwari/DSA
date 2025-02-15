package Teest;
import java.util.HashMap;
import java.util.Map;

public class LetterCount {

    public static String letterCount(String str) {
        String[] words = str.split(" ");
        int maxRepeats = 0;
        String result = "-1";

        for (String word : words) {
            int repeats = countRepeats(word);
            if (repeats > maxRepeats) {
                maxRepeats = repeats;
                result = word;
            }
        }

        return result;
    }

    private static int countRepeats(String word) {
        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : word.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        int maxCount = 0;
        for (int count : charCounts.values()) {
            maxCount = Math.max(maxCount, count);
        }

        return Math.max(0, maxCount - 1);
    }

    public static void main(String[] args) {
        System.out.println(letterCount("Hello apple pie")); // Output: Hello
        System.out.println(letterCount("No words")); // Output: -1
        System.out.println(letterCount("Today, is the greatest day ever!")); // Output: greatest
        System.out.println(letterCount("mmmaa")); // Output: mmaa
        System.out.println(letterCount("Hellooo apple pie")); // Output: Hellooo
    }
}
