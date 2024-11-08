public class binarySearch {

    public static int binarySearching(int numbers[], int key) {
        int start = 0;
        int end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            //comparisons
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {  // right
                start = mid+1;
            } else{  // left
                end = mid-1;
            }
        }

        return -1;


    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("index for key is : " + binarySearching(numbers, key));
    }
}
