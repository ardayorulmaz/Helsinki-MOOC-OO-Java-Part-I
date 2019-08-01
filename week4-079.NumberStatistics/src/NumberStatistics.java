
public class NumberStatistics {

    private int amountOfNumbers;
    private int sumOfNumbers;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sumOfNumbers = 0;

        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
        if (number != -1) {
            this.sumOfNumbers += number;
            this.amountOfNumbers++;
        }

    }

    // code here
    public int amountOfNumbers() {
        return this.amountOfNumbers;

        // code here
    }

    public int sum() {
        return this.sumOfNumbers;

        // code here
    }

    public double average() {

        if (sum() == 0) {
            return 0;
        } else {
            return ((double) sum() / (double) this.amountOfNumbers);
        }

        // code here
    }

}
