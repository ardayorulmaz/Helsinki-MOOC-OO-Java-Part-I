/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
public class Book {

    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String publisher() {
        return this.publisher;
    }

    public String title() {
        return this.title;
    }

    public int year() {
        return this.year;
    }

    @Override
    public String toString() {
     return this.title + ", " + this.publisher + ", " + this.year;
    }

}
