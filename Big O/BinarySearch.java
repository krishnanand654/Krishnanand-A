public class BinarySearch {

    // Returns index of x if it is present in arr[], else return -1
    int binarySearch(int arr[], int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                left = mid + 1;

            // If x is smaller, ignore right half
            else
                right = mid - 1;
        }

        // If we reach here, then element was not present
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        BinarySearch bs = new BinarySearch();
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        int x = 50;
        int result = bs.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result+"->"+System.currentTimeMillis());
    }
}
