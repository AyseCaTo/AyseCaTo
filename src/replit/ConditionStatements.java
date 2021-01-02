package replit;

public class ConditionStatements {

    public static void main(String[] args) {

        String word = "aysecatolife";

        String result = (word.endsWith("y"))?"-ies":(word.endsWith("ey"))?"-eys":(word.endsWith("ife"))?"-ives":"-s";

        System.out.println(result);
    }


}
/*
 For you to do:

Given a string variable "word", do the following tests

If the word ends in "y", print "-ies"
If the word ends in "ey", print "-eys"
If the word ends in "ife", print "-ives"
If none of the above is true, print "-s"
No more than one should be printed.
 */