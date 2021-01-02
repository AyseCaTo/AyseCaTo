package replit;

import java.util.ArrayList;

public class DeclaringArrayLists {

    public static ArrayList<Integer> test() {
        ArrayList<Integer> nums = new ArrayList<>();
        return nums;

    }
}
/*
Write code in the test method that will declare and initialize an ArrayList of Integers, then return it as is - empty.

An ArrayList is a collection of objects, similar to an array.  However, a few notable differences in how they work:
The size of an ArrayList can be changed
You can add, insert, and delete elements easily with ArrayLists
You can only have ArrayLists of objects!  (int/double/boolean are primitive datatypes)

IMPORTANT: Please note that we will be working with new objects that represent primitive datatypes:
Integer is an object that represent an int
Double is an object that represents a double
Boolean is an object that represents a boolean
(Note the capital letters for the objects!)

However, unlike arrays, ArrayLists need to be imported before they can be used.  The line that we use to do this is the following (written outside the class header on line 3):
import java.util.ArrayList;

This allows us to create the ArrayList object.

To declare and initialize an ArrayList, we use the same code as we did to declare objects, except this time, our datatype is ArrayList<Type>:
// create an arraylist of Strings
    ArrayList<String> names = new ArrayList<>();
//  |<------------------->|   |<-------------------->|
//     declaration                 initialization

// create an arraylist of Integers
    ArrayList<Integer> nums = new ArrayList<>();
 */