package replit;

public class Telephone {

    public String number;
    public static int quantity = 250;
    public static double total = 15658.92;

    public void SetNumber(String number) {
        this.number = number;
    }


    public String getNumber() {
        return "\nTelephone" +
                "\nnumber='" + number + '\'' +
                "\n===========================";
    }
}
