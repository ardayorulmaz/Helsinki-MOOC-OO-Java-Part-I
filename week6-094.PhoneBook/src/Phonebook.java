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

public class Phonebook {

   
    private ArrayList<Person> phonelist;

    public Phonebook() {
       
        this.phonelist = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        Person newperson = new Person(name, number);
        this.phonelist.add(newperson);

    }

    public void printAll() {
        for (Person person : phonelist) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : phonelist) {
            if (person.getName().contains(name)) {
                return person.getNumber();
            }

        }
        return "number not known";
    }

}
