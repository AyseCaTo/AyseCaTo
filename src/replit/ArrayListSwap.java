package replit;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwap {

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        Collections.swap(list, pos1, pos2);
        return list;

    }

    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) {
        r.removeIf(p->p==n);
        return r;
    }

    public static boolean isError(String line) {
        ArrayList<String> words = new ArrayList<>();
        for (String each: line.split(" ")){
            words.add(each);
        }
        if (words.get(0).equals("error")) return true;
        else return false;
    }

    public static void main(String[] args) {

        System.out.println(isError("one two error"));

    }//end main


}
/*
In this assignment you will swap a position in an array list with another.
swap gets 3 arguments, an arraylist, a position, and another position to swap with.
for example:
swap(["one","two","three"],0,2)
returns:["three","two","one"]
swap(["a","c","b","d","e"],0,3)
returns:["d","c","b","a","e"]
 */