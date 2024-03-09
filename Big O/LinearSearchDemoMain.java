 class LinearSearchDemo {
        int linearSearch(int arr[], int searchkey) {

                for (int i = 0; i < arr.length; i++) {

                        if (arr[i] == searchkey) {

                                return i;

                        }

                }

                return -1; /// not found
        }
 }

public class LinearSearchDemoMain {

        public static void main(String[] args) {
                
                
                int arr[] = {10,20,30,40,50};
                int searchkey =50;// search from here
                
                LinearSearchDemo res = new LinearSearchDemo();
                
                int result = res.linearSearch(arr ,searchkey);
                
                System.out.println(" resullt of my search index "+result+"->"+System.currentTimeMillis());
                System.currentTimeMillis();
                
        
        }

}