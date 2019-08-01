/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
public class Product {

    private String productName;
    private double productPrice;
    private int productAmount;

    public Product(String name, double price, int amount) {
        this.productName = name;
        this.productPrice = price;
        this.productAmount = amount;
    }

    public void printProduct() {
        System.out.println(this.productName + ", " + this.productPrice + ", " + this.productAmount);
    }

}
