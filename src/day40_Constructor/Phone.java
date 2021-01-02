package day40_Constructor;

public class Phone {

    public String brand, model, size;
    public double price;

    public static boolean hasScreen;

    static {
        hasScreen = true;
    }

    public Phone(String brand) {
        this.brand = brand;
    }

    public Phone(String brand, String model) {
        this(brand);
        this.model = model;
    }

    public Phone(String brand, String model, String size) {
        this(brand, model);
        this.size = size;
    }

    public Phone(String brand, String model, String size, double price) {
        this(brand, model, size);
        this.price = price;
    }


    public String toString() {
        return  "\nbrand='" + brand + '\'' +
                "\nmodel='" + model + '\'' +
                "\nsize='" + size + '\'' +
                "\nprice=" + price +
                "\n============================";
    }
}
/*
 Phone:
        variables:
            brand, model, price, size, hasScreen,
        add a constructor to initialize the fields
        methods:
            toString
 */
