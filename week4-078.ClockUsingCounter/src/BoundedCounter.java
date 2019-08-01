/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
public class BoundedCounter {

    private int value;
    private int upperBound;
    private int currentNum;

    public BoundedCounter(int upperLimit) {
        if (upperLimit > 0) {
            this.upperBound = upperLimit;
        }
        // write code here
    }

    public int getValue() {

        return this.value;
    }

    public void next() {
        this.value += 1;
        if (value > this.upperBound) {
            this.value = 0;
        }
        // write code here
    }

    public void setValue(int t) {
        if (t > 0 && upperBound >= t) {
            this.value = t;
        }
    }

    public String toString() {

        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;

        // write code here
    }

}
