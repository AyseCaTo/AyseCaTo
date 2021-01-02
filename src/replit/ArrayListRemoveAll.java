package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAll {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        System.out.println(appendPosSum(numbers));

        ArrayList<Boolean> lists = new ArrayList<>(Arrays.asList(true, false, false));
        repeatAL(lists);
    }

    public static void removeAll(ArrayList<String> wordList, String targetWord){
        wordList.removeIf(p->p.equals(targetWord));
    }

    public static ArrayList<String> combineAll(ArrayList<String> wordList1, ArrayList<String> wordList2){
        ArrayList<String> combine = new ArrayList<>(wordList1);
        combine.addAll(wordList2);
        return combine;
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
        ArrayList<Integer> posNums = new ArrayList<>();
        int sum = 0;
        for (int each : nums){
            if (each>0){
                posNums.add(each);
                sum += each;
            }
        }
        posNums.add(sum);
        return posNums;

    }

    public static void repeatAL(ArrayList<Boolean> list){
        ArrayList<Boolean> list1 = new ArrayList<>(list);
        list1.addAll(list);
        System.out.println(list1);
    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> intList){
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int each : intList){
            integerArrayList.add(each*2);
        }

        return integerArrayList;
    }
}
/*
Task1.
Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord
This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.
Example:
ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
removeAll(wordList,"hi");
now wordList is ["hey","yo"]
 */

/*
Task2.
Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2
This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, then add all the words (in order) from wordList2.
In other words, it is combining all the elements from the two parameters.
 */
