package replit.Custom;

public class StoreProduct {

    public String label, category;
    public int price, stock;
    public boolean hasExpiration;

    public StoreProduct(String label, String category, int price, int stock, boolean hasExpiration) {
        this.label = label;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.hasExpiration = hasExpiration;
    }

    public StoreProduct(String label, String category, int price, boolean hasExpiration) {
        this.label = label;
        this.category = category;
        this.price = price;
        this.hasExpiration = hasExpiration;
    }

    public StoreProduct(String label, int price, int stock) {
        this.label = label;
        this.price = price;
        this.stock = stock;
    }

    public StoreProduct(String label, int price) {
        this.label = label;
        this.price = price;
    }

    public void expired(boolean hasExpired){
        if (hasExpired) stock = 0;
    }

    public boolean sale(int quantity){
        if (stock>quantity) {
            stock -= quantity;
            return true;
        }else{ return false;}
    }

    public double getDiscountedPrice(double discount){
        if (discount>0.01 && discount<1)
           price*=(1-discount);
        return price;
    }



}
