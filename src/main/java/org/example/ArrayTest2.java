package org.example;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest2 {
    static int[] numbers = {-1,2,-3,4,-5,6,-7,8,-9,10,-11,12,-13,14,-15,16,-17,18,-19,20};


    public static void tripledNums(){
        int i = 0;

        for (int num : numbers) {
            if (num >= 0) {
                numbers[i++] = num*3;

            } else {
                numbers[i++] = num;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Initial Array: " + Arrays.toString(numbers));
        System.out.print("New Array: ");



    }
    }









