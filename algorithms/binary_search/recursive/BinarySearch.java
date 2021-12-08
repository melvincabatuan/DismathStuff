public class BinarySearch {

    public static int binary_search(final int[] arr, final int key, int begin, int end) {
        /**
         *     INPUT :
         *             arr - a sequence of sorted integers;
         *             key - integer to search for;
         *             begin - start index of the sequence;
         *             end - ending index of the sequence
         *     OUTPUT:
         *             index of the element or key IF found
         *             -1 IF not found
         */
        if (end >= begin){
            int mid = (begin + end) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                return binary_search(arr, key, begin, mid);
            else
                return binary_search(arr, key, mid + 1, end);
        }
        return -1;
    }

    public static void main(String[] args) {
        final int numbers[] = new int[]{1, 3, 7, 8, 9, 10, 17, 23, 25, 30, 31};
        // Existent value
        System.out.println(binary_search(numbers, 1, 0, numbers.length - 1));
        System.out.println(binary_search(numbers, 31, 0, numbers.length - 1));
        // Nonexistent value
        System.out.println(binary_search(numbers, 88, 0, numbers.length - 1));
    }
}
