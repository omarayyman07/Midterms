public class EX3 {

    // Method to reverse the order of words in the sentence
    public static String sentenceReverse(String sentence) {
        String reversedSentence = "";
        String word = "";

        // Traverse the string in reverse order
        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (sentence.charAt(i) != ' ') {
                word = sentence.charAt(i) + word;  // Build the word in reverse order
            } else {
                if (!word.isEmpty()) {
                    reversedSentence += word + " ";  // Add the word and a space to the result
                    word = "";  // Reset word for next one
                }
            }
        }

        // Add the last word if there is one
        if (!word.isEmpty()) {
            reversedSentence += word;
        }

        return reversedSentence;  // Remove any trailing space
    }

    public static void main(String[] args) {
        String input = "Hello world how are you";
        System.out.println(sentenceReverse(input));  // Output: "you are how world Hello"
    }
}
