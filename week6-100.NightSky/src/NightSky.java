/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.width = width;
        this.height = height;
        this.density = density;
    }

    public void printLine() {
        Random chance = new Random();
        
        for (int i = 0; this.width > i; i++) {
            double number = chance.nextDouble();

            if (number
                    <= this.density) {

                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }

        }

    }

    public void print() {
        starsInLastPrint=0;
        for (int i = 0; this.height > i; i++) {
            this.printLine();
            System.out.println("");
        }

    }

    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
}
