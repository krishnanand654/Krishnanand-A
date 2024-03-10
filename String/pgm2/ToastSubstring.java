public class ToastSubstring {
    public static void main(String[] args) {
        String inputString = "toast is used to print some message in android, this is why we use toast";
        String result = getSubstringBetweenFirstAndLastToast(inputString);
        
        if (!result.isEmpty()) {
            System.out.println(result);
        } else {
            System.out.println("Substring 'toast' does not exist.");
        }
    }
    
    public static String getSubstringBetweenFirstAndLastToast(String inputString) {
        int firstIndex = inputString.indexOf("toast");
        int lastIndex = inputString.lastIndexOf("toast");
        
        if (firstIndex == -1 || lastIndex == -1 || firstIndex == lastIndex) {
            // 'toast' does not exist or only exists once
            return "";
        } else {
            // Extract substring between first and last appearance of 'toast'
            return inputString.substring(firstIndex + "toast".length(), lastIndex);
        }
    }
}
