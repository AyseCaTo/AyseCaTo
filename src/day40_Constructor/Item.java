package day40_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {

    public String name;
    public double unitPrice, totalCost;
    public int quantity;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, double unitPrice) {
        this(name);
        this.unitPrice = unitPrice;
    }

    public Item(String name, double unitPrice, int quantity) {
        this(name, unitPrice);
        this.quantity = quantity;
        totalCost = calculateCost();
    }

    public double calculateCost(){
        totalCost = unitPrice * quantity;
        return totalCost;
    }


    public String toString() {
        return "\nItem" +
                "\nname='" + name + '\'' +
                "\nunitPrice=" + unitPrice +
                "\nquantity=" + quantity +
                "\ntotalCost=" + totalCost +
                "\n============================";
    }
}

/*
 Item:
        variables:
            name, unitPrice, quantity
        add constructor to initialize all fields of Item
        methods:
            calcCost(): returns the total cost
                        hint:  total cost is = quantity * unitPrice
            toString()

 */


class ItemObjects{

    public static void main(String[] args) {

        ArrayList<Item> listOfItems = new ArrayList<>(Arrays.asList(new Item("toilet paper", 20, 50),
                new Item("sanitizer", 15, 30), new Item("mask", 10, 225)));

        System.out.println(listOfItems);

        double maxCost = listOfItems.get(0).totalCost;

        for (Item eachItem : listOfItems){
            maxCost = Math.max(eachItem.totalCost, maxCost);
                   }

        System.out.println("maxCost = " + maxCost);

        System.out.println("===================================");

        double totalCost = 0;

        for (Item eachItem : listOfItems){
            totalCost += eachItem.totalCost;
        }

        System.out.println("totalCost = " + totalCost);

        System.out.println("===================================");

        listOfItems.removeIf(p->p.name.equals("toilet paper"));

        for (Item eachItem : listOfItems){
            System.out.println(eachItem.name);
        }

    }

}
