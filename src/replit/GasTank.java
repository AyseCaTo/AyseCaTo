package replit;

public class GasTank {

    public double amount = 0, capacity;

    public GasTank(double amount, double capacity) {
        this.amount = amount;
        this.capacity = capacity;
    }

    public void addGas(double d){
        amount+=d;
        if (amount==capacity) amount = capacity;
    }

    public void useGas(double d){
        amount-=d;
        if (amount==0) amount = 0;
    }

    public boolean isEmpty(){
        if (amount<0.1) return true;
        else return false;
    }

    public boolean isFull(){
        if (amount>capacity-0.1) return true;
        else return false;
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        return capacity-amount;
    }
}
