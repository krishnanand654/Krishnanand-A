import java.util.Arrays;

public class ClosestToZero {

    public static void main(String[] args) {
        int[] array = {1, 5, -8, 10, -3, 9, -7};
        findClosestToZero(array);
    }

    public static void findClosestToZero(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should contain at least two elements");
            return;
        }

        Arrays.sort(array); // Sort the array

        int minSum = Integer.MAX_VALUE;
        int minLeft = 0;
        int minRight = 0;

        //Nested loops to find sum of every combinations and find the numbers with least sum which is closest to 0
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                // System.out.println("Pair: (" + array[i] + ", " + array[j] + "), Sum: " + sum); This is to illustrate the sum
                if (Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    minLeft = i;
                    minRight = j;
                }
            }
        }

        System.out.println("The two elements whose sum is closest to zero are: " + array[minLeft] + " and " + array[minRight]);
    }
}
