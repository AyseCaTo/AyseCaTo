package replit;


public class MixedCases {

    public static void main(String[] args) {

        String str = "gfwtuywywyrtrofjfrkfrl";
        String mixed = "";

        for (String each : str.split("")){
            for (int i = 0; i<str.length(); i+=2)
                mixed += each.toLowerCase();

            for (int j = 1; j<str.length(); j+=2)
                    mixed += each.toUpperCase();

        }

        System.out.println(mixed);


    }


}
/*
Given the following inputs:
String s;
Write a for loop that will print out the string in alternating cases, with the first letter being lowercase.
Keep in mind the following String methods:
str.toUpperCase(); //make it uppercase
str.toLowerCase(); //make it lowercase
DO NOT USE .charAt()!  .charAt returns a character, and you need a string in order to make it upper/lowercase.  To get a letter at a single position, use the following:
str.substring(x,x+1); //gives character as string at position x
Sample input/outputs:
In: powerful
pOwErFuL
In: COMEDIC
cOmEdIc
In: acroBATics
aCrObAtIcS
HINT: You will need to use an IF statement inside your for loop!
 */