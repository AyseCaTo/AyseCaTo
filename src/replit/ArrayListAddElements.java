package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListAddElements {

    public static int[] addElements(int[] ints1, int[] ints2) {
        int[] arr = new int[ints1.length];

        for (int i = 0; i< ints1.length; i++){
            arr[i] = ints1[i] + ints2[i];
        }

        return arr;
    }

    public static int[] do_switch(int[] i) {

        Collections.swap(Arrays.asList(i), 0, i.length-1);
        return i;
    }

    public static void main(String[] args) {
        //int[] arr = {1,2,3,4};
        //System.out.println(do_switch(arr).toString());

        int [] i= new int[3];
        i= populate(i) ;
        System.out.println(Arrays.toString(i));

    }

    public static int[] populate(int[] r) {
        for (int i = 0; i<r.length; i++){
            r[i]=i+1;
        }
        return r;
    }


}
/*
Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array. You can assume that each array has 5 elements

addElements([10, 40, 50, 3, 1], [11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]

 */

/*
Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]
 */
