public class EX4 {

    public static String mergeStringSorted(String s1, String s2) {
        // Base cases
        if (s1.equals("")) {
            return s2; // If s1 is empty, return s2
        }
        if (s2.equals("")) {
            return s1; // If s2 is empty, return s1
        }

        // Recursive case: Compare the first characters of both strings
        if (s1.charAt(0) <= s2.charAt(0)) {
            // If the first character of s1 is smaller or equal, take it and recurse
            return s1.charAt(0) + mergeStringSorted(s1.substring(1), s2);  // DON'T use substring in real scenario
        } else {
            return s2.charAt(0) + mergeStringSorted(s1, s2.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(mergeStringSorted("ACDX", "ABZ")); // Output: "AABCDXZ"
        System.out.println(mergeStringSorted("ABC", "DEF")); // Output: "ABCDEF"
        System.out.println(mergeStringSorted("X", "ABZ")); // Output: "ABXZ"
        System.out.println(mergeStringSorted("Aab", "Cc")); // Output: "ACabc"
    }
}

