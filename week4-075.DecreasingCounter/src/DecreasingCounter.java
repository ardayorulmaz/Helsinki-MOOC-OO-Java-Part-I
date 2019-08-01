
public class DecreasingCounter {

    private int value;  // instance variable that remembers the value of the counter
    int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (this.value > (0)) {
            this.value=value-1;
        } else {
            this.value = this.value;
        }
        // write here code to decrease counter value by one
    }

    public void reset() {
        this.value = 0;
    }
    // write here code to decrease counter value by one

    public void setInitial() {
        this.value = this.initialValue;
    }

    // and here the rest of the methods
}
