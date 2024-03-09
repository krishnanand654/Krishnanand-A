import java.util.HashSet;
import java.util.Set;

public class DuplicateValues {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 6, 6,7, 8, 1};
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements in the array are:");
        for (int num : duplicates) {
            System.out.println(num);
        }

        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Current system time in milliseconds: " + currentTimeMillis);
    }
}


// public class DuplicateValues {
//     public static void main(String[] args) {
//         int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 1};
//         findDuplicates(array);
//     }

//     public static void findDuplicates(int[] array) {
//         System.out.println("Duplicate elements in the array are:");
//         for (int i = 0; i < array.length - 1; i++) {
//             for (int j = i + 1; j < array.length; j++) {
//                 if (array[i] == array[j]) {
//                     System.out.println(array[i]);
//                     break; // Once a duplicate is found, no need to continue inner loop for this element
//                 }
//             }

//         }
//         long currentTimeMillis = System.currentTimeMillis();
//         System.out.println("Current system time in milliseconds: " + currentTimeMillis);
//     }
// }
