/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
public class Bird {

    private String name;
    private String latinName;
    private int obsnum;

    public Bird(String name, String latinname) {
        this.name = name;
        this.latinName = latinname;
        this.obsnum = 0;
    }

    public void observe() {
        this.obsnum++;
    }

    public String Show(Bird name) {
        return name.toString();
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.obsnum + " observations \n";
    }
}
