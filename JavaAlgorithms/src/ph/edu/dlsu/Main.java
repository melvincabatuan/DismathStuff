package ph.edu.dlsu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Part 1: Finding Max and Min
        Dismath.initializeInputSequence();
        Dismath.displayInputSequence();
        Dismath.findMax();
        Dismath.findMin();

        // Part 2: Sort
        // Dismath.simpleBubbleSort();
        // Dismath.betterBubbleSort();
        Dismath.insertionSort();

        // Part 3: Search (Linear and Binary)
        System.out.println("\nWhat integer are you looking for?");
        int key = input.nextInt();
        System.out.println("\nLinear Search:");
        Dismath.linearSearch(key);
        System.out.println("\nBinary Search:");
        Dismath.binarySearch(key);

    }
}
