package replit.Custom;

public class Atts {

    public String name, color;
    public int amount;


    public String asString() {
        return  "name: " + name + " color: " + color + " amount: " + amount;
    }
}
class Ayse {
    public static void main(String[] args) {

        Atts a = new Atts();
        a.name = "ball";
        a.color = "red";
        a.amount = 1;


        System.out.println(a.asString());
    }
}