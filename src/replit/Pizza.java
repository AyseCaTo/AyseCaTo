package replit;

public class Pizza {

    private String size;
    private int numberOfCheese, numberOfPepperoni, numberOfHam;

    public Pizza(String size, int numberOfCheese, int numberOfPepperoni, int numberOfHam) {
        this.size = size;
        this.numberOfCheese = numberOfCheese;
        this.numberOfPepperoni = numberOfPepperoni;
        this.numberOfHam = numberOfHam;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumberOfCheese() {
        return numberOfCheese;
    }

    public void setNumberOfCheese(int numberOfCheese) {
        this.numberOfCheese = numberOfCheese;
    }

    public int getNumberOfPepperoni() {
        return numberOfPepperoni;
    }

    public void setNumberOfPepperoni(int numberOfPepperoni) {
        this.numberOfPepperoni = numberOfPepperoni;
    }

    public int getNumberOfHam() {
        return numberOfHam;
    }

    public void setNumberOfHam(int numberOfHam) {
        this.numberOfHam = numberOfHam;
    }

    public double calcCost(){
        double cost = (size.equals("small"))?10:(size.equals("medium"))?12:14;
        cost+=numberOfCheese*2+numberOfHam*2+numberOfPepperoni*2;
        return cost;
    }

    public String getDescription(){
        return size + " Pizza with " + numberOfCheese + " Cheese topping, " + numberOfPepperoni + " Pepperoni toppings, and " +
                numberOfHam + " Ham toppings. \nTotal Price: " + calcCost();
    }
}
