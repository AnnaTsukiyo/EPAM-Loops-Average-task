package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Use Scanner methods to read input
            int counter = 0, input = 0, large = Integer.MIN_VALUE,sum=0;
            Scanner in = new Scanner(System.in);
            while ((input = in.nextInt()) != 0) {
                large = Integer.max(large, input);
                sum += input;
                counter++;
            }
            if (counter == 0) {
                System.out.println("No data was entered.");
            }else{
                double average = sum/counter;
                System.out.println((int)average);
            }
    }
}