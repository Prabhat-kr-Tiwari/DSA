package StringPracticePhase2;


public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String inputString = "0010";
        String result = removeLeadingZeros(inputString);
        System.out.println(result); // Output: "10"
    }

    public static String removeLeadingZeros(String input) {
        int startIndex = 0;

        // Find the index of the first non-zero digit
        while (startIndex < input.length() && input.charAt(startIndex) == '0') {
            startIndex++;
        }

        // If startIndex is equal to the length of the input, it means the string is all zeros
        if (startIndex == input.length()) {
            return "0";
        }

        return input.substring(startIndex);
    }
}

