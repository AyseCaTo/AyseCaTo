package replit;

public class AppearTwice {

    public static boolean appearsTwice(String target, String sentence){
        int count = 0;
        for (String each:sentence.split("")){
            each.replace(target,"");
            count++;
        }
        if (count==2) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old."));
    }
}
