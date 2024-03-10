public class CheckSequence {
    public static void main(String[] args) {
        String inputString = "Hello, world!";
        String sequence = "world";
        
        boolean containsSequence = containsSequence(inputString, sequence);
        
        if (containsSequence) {
            System.out.println("The input string contains the specified sequence.");
        } else {
            System.out.println("The input string does not contain the specified sequence.");
        }
    }
    
    public static boolean containsSequence(String inputString, String sequence) {
        if (inputString == null || sequence == null || inputString.length() < sequence.length()) {
            return false;
        }
        
        for (int i = 0; i <= inputString.length() - sequence.length(); i++) {
            if (inputString.substring(i, i + sequence.length()).equals(sequence)) {
                return true;
            }
        }
        
        return false;
    }
}