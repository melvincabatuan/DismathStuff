package ph.edu.dlsu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by cobalt on 3/15/16.
 */
public class Dismath {

    private static ArrayList<Integer> inputSequence;

    public static void initializeInputSequence() {
        inputSequence = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Input a sequence elements: (q or any non-integer to quit)");

        while (input.hasNextInt()) {
            inputSequence.add(input.nextInt());
        }
    }

    public static void displayInputSequence() {
        System.out.println("Input sequence:");
        for (Integer anInputSequence : inputSequence) {
            System.out.print(anInputSequence + " ");
        }
        System.out.println("");
    }

    public static void findMax() {
        int largest;
        while (inputSequence.isEmpty()) {
            initializeInputSequence();
        }

        // result <- a1
        largest = inputSequence.get(0);

        for (int i = 1; i < inputSequence.size(); i++) {
            if (inputSequence.get(i) > largest)
                largest = inputSequence.get(i);
        }
        System.out.println("\nThe maximum element is " + largest + ".");
    }


    public static void findMin() {
        int smallest;
        while (inputSequence.isEmpty()) {
            initializeInputSequence();
        }

        // result <- a1
        smallest = inputSequence.get(0);

        for (int i = 1; i < inputSequence.size(); i++) {
            if (inputSequence.get(i) < smallest)
                smallest = inputSequence.get(i);
        }
        System.out.println("\nThe minimum element is " + smallest + ".");
    }


    public static void linearSearch(final int key) {

        while (inputSequence.isEmpty()) {
            initializeInputSequence();
        }

        int location = -1;

        for (int i = 0; i < inputSequence.size(); ++i) {
            if (inputSequence.get(i) == key) {
                location = i;
            }
        }

        if (location != -1) {
            System.out.println("\nElement " + key + " is found at location [" + location + "].");
        } else {
            System.out.println("" + key + " was not found!");
        }
    }


    public static void binarySearch(final int key) {

        while (inputSequence.isEmpty()) {
            initializeInputSequence();
        }

        Collections.sort(inputSequence);
        displayInputSequence();

        int location = -1;
        int begin = 0; // beginning of the index
        int end = inputSequence.size() - 1; // end of the index
        int mid = 0;

        while (begin < end) {

            // Display the begin and end indices
            System.out.println("begin = " + begin + " ; end = " + end);

            // Get the index of the last element of lower half
            mid = (int) Math.floor((begin + end) / 2.0);

            // Display the last element of lower half
            System.out.println("data[" + mid + "] = " + inputSequence.get(mid));

            // Choose the upper or lower half of data
            if (inputSequence.get(mid) < key)
                begin = mid + 1;  // upper half of data
            else
                end = mid;        // lower half of data
        }

        // Update location if element is found; default location = -1 (not found)
        if (inputSequence.get(begin) == key) location = begin;

        if (location != -1) {
            System.out.println("\nElement " + key + " is found at location [" + location + "].");
        } else {
            System.out.println("" + key + " was not found!");
        }
    }



    public static void simpleBubbleSort() {
        int temp;
        for(int i = 0; i < inputSequence.size() - 1; i++){
            System.out.println("i = " + i);
            for(int j = 0; j < inputSequence.size() - i - 1; j++){
                if(inputSequence.get(j) > inputSequence.get(j+1)){ /// Swap the two values
                    temp = inputSequence.get(j);
                    inputSequence.set(j, inputSequence.get(j+1));
                    inputSequence.set(j+1,temp);
                }
                displayInputSequence();
            }
        }
    }


    public static void betterBubbleSort() {
        int temp; // temporary variable used in swapping
        int swaps; // number of swaps per iteration
        int i = 0; // bubble sort iteration

        while(true){
            System.out.println("i = " + i);
            swaps = 0;

            for(int j = 0; j < inputSequence.size() - i - 1; j++){
                if(inputSequence.get(j) > inputSequence.get(j+1)){ /// Swap the two values
                    temp = inputSequence.get(j);
                    inputSequence.set(j, inputSequence.get(j+1));
                    inputSequence.set(j+1, temp);
                    swaps++;
                }
                displayInputSequence();
            }

            /// termination/ sentinel
            if (swaps == 0)
                break;

            i++;
        }
    }



    public static void insertionSort() {
        int temp, i, j;
        for(i = 1; i < inputSequence.size(); i++){
            System.out.print("i = " + i + "; ");
            temp = inputSequence.get(i);
            System.out.println("temp = " + temp);
            j = i - 1; // index of previous element
            while((j > -1) && (inputSequence.get(j) > temp)){
                inputSequence.set(j+1, inputSequence.get(j));
                j--;
                displayInputSequence();
            }
            inputSequence.set(j+1, temp);
            displayInputSequence();
        }
    }

}
