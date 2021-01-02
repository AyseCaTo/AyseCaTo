package replit;

public class VowelLetters {

    public static void main(String[] args) {

        String str = "gugehebgejeoj37462940jdbca.klbh";
        String vowels = "";

        for (String each : str.split("")){
            if (each.equalsIgnoreCase("a")||each.equalsIgnoreCase("e")||each.equalsIgnoreCase("i")||
                    each.equalsIgnoreCase("u")||each.equalsIgnoreCase("o")){
                vowels+=each;
            }

        }
        System.out.println(vowels);
    }
}
