public class SmallestAndSecondSmallest {
    public static void main(String[] args) {
        int[] array = {5, 8, 1,2, 6, 3};
        findSmallestAndSecondSmallest(array);
    }

    public static void findSmallestAndSecondSmallest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should contain at least two elements");
            return;
        }

        int smallest = array[0];
        int secondSmallest = array[1];

        if (secondSmallest < smallest) {
            smallest = array[1];
            secondSmallest = array[0];
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] < smallest) {
             
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}
