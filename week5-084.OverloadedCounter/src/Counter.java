/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
public class Counter {

    private int value;
    private boolean status;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.status = check;

    }

    public Counter(int startingValue) {
        this(startingValue, true);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
        if (this.value < 0 && this.status ) {
            this.value = 0;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            this.value -= decreaseAmount;
            if (this.status) {
                this.value = 0;
            }
        }
    }
}
