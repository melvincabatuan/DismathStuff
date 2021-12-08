public class LinearSearch {

    public static int linear_search(final int[] arr, final int key) {
        /**
         *     INPUT :
         *             arr - a sequence of sorted integers;
         *             key - integer to search for;
         *     OUTPUT:
         *             index of the element or key IF found
         *             -1 IF not found
         */
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        final int numbers[] = new int[]{1, 3, 7, 8, 9, 10, 17, 23, 25, 30, 31};
        // Existent value
        System.out.println(linear_search(numbers, 1));
        System.out.println(linear_search(numbers, 31));
        // Nonexistent value
        System.out.println(linear_search(numbers, 88));
    }
}
