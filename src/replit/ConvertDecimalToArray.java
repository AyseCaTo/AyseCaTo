package replit;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertDecimalToArray {
    public static void main(String[] args) {

        int[] arr = new int[8];

        printBinaryForm(3);
   }

    private static void printBinaryForm(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return; // KICK OUT OF THE RECURSION
        }

        remainder = number % 2;
        printBinaryForm(number >> 1);
        System.out.print(remainder);
    }
}

