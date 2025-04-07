public class EX5 {
    public static int findNonRepeat(String n){
        for (int i = 0; i < n.length(); i++) {
            boolean repeated = false;

            for (int j = 0; j < n.length(); j++) {
                if (i != j && n.charAt(i) == n.charAt(j)) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        System.out.println(findNonRepeat("omar"));  // Output: 0
    }
}
