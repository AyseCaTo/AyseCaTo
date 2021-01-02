package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysDiving {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        float sum = 0;

        for (int i = 0, j=1; i< score.length; i++, j++){
            System.out.println("Enter score for judge " + j + ":");
            score[i] = input.nextFloat();
            sum += score[i];
        }

        System.out.println(score.toString());
        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();

        Arrays.sort(score);
        float min = score[0];
        float max = score[score.length-1];

        System.out.println(min);
        System.out.println(max);


        double total = (sum - (min + max)) * difficulty * 0.6;

        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
}
}
