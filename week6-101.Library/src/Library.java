/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
import java.util.ArrayList;
public class Library {

    private ArrayList<Book> liblist;

    public Library() {
        this.liblist = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.liblist.add(newBook);
    }

    public void printBooks() {
        for (Book book : this.liblist) {
            System.out.println(book);

        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> result = new ArrayList<Book>();

        for (Book book : this.liblist) {
            if (StringUtils.included(book.title(), title)) {
                result.add(book);
                // Book found!
            }

        }
        return result;
    }

    public ArrayList<Book> searchByPublisher(String Publisher) {
        ArrayList<Book> result = new ArrayList<Book>();

        for (Book book : liblist) {
            if (StringUtils.included(book.publisher(), Publisher)) {
                result.add(book);
            }
        }
        return result;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> result = new ArrayList<Book>();

        for (Book book : liblist) {
            if (book.year() == year) {
                result.add(book);
            }
        }
        return result;
    }

}
