public class EX3 {

    public static String reverseChunk(String s, int n) {
        // Initialize an empty string for the result
        String result = "";
        int i = 0;

        // Process the string in chunks of size n
        while (i < s.length()) {
            // Calculate the end index manually
            int end = i + n;
            if (end > s.length()) {
                end = s.length(); // Make sure we don't go out of bounds
            }

            // Reverse the chunk and append to the result
            for (int j = end - 1; j >= i; j--) {
                result += s.charAt(j);
            }

            // Move to the next chunk
            i += n;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseChunk("123456", 2)); // Output: "214365"
        System.out.println(reverseChunk("123456", 3)); // Output: "321654"
        System.out.println(reverseChunk("5492178625", 4)); // Output: "2945687125"
        System.out.println(reverseChunk("abcdefg", 4)); // Output: "dcbaefg"
    }
}
