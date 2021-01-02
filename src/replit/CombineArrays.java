package replit;

public class CombineArrays {

    public static String combineRs(String[] r1,String[] r2){

        String combine = "";

        for (String each1 : r1){
            combine += each1;
        }

        for (String each2 : r2){
            combine += each2;
        }

        return combine;

    }
}
/*
combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
 */