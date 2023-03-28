package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayTest {


    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        // read size of the array
//        System.out.print("Enter size of the array: ");
//        int n = scan.nextInt();
//
//        // create an int array of size n
//        int numbers[] = new int[n];
//
//        // take input for the array
//        System.out.println("Enter array elements: ");
//        for (int i = 0; i < n; ++i) {
//            numbers[i] = scan.nextInt();
//        }

        int[] numbers;
        numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int)(Math.random() * 31) - 20);
            System.out.println(numbers[i]);
        }

        // display negative numbers
        seperate(numbers);

        // close Scanner
//        scan.close();

    }
    public static void printTripledNumbers(int[] arr) {
        IntStream.range(0, arr.length)
                .filter(g -> g >= 0)
                .map(g -> arr[g] * 3)
                .forEach(System.out::println);
    }

    // method to seperate +ve, -ve numbers
    public static void seperate(int[] numbers) {

        // variables
        int posCount = 0;
        int negCount = 0;
        int positive[] = null;
        int negative[] = null;

        // count positive and negative numbers
        for (int i : numbers) {
            if (i >= 0)
                ++posCount;
            else
                ++negCount;
        }

        // if array contains only positive or negative
        if (posCount == 0) {
            System.out.println("Array contains only negative numbers");
            // display array
            System.out.println("Array = " + Arrays.toString(numbers));
            return;
        } else if (negCount == 0) {
            System.out.println("Array contains only positive numbers");
            // display array
            System.out.println("Array = " + Arrays.toString(numbers));
            return;
        }

        // create positive and negative array
        positive = new int[posCount];
        negative = new int[negCount];

        // check element and insert
        int i = 0;
        int j = 0;
        for (int num : numbers) {
            if (num >= 0) {
                positive[i++] = num;

            } else {
                negative[j++] = num;
            }
        }


        // all arrays
        System.out.println("Initial Array: "
                + Arrays.toString(numbers));
        System.out.println("Negative numbers = "
                + Arrays.toString(negative));
        System.out.println("Positive numbers = "
                + Arrays.toString(positive));
        printTripledNumbers(numbers);
    }
    }









