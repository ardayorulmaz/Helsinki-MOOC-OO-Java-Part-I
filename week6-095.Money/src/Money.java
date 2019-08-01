
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {

        Money sum = new Money((this.euros + added.euros), (this.cents + added.cents));
        return sum;

    }

    public Money minus(Money decremented) {
        if (this.euros > decremented.euros) {
            if (this.cents < decremented.cents) {
                Money minusmoney = new Money((this.euros - 1 - decremented.euros), ((this.cents + 100) - decremented.cents));
                return minusmoney;
            } else {

                Money minusmoney = new Money((this.euros - decremented.euros), (this.cents - decremented.cents));
                return minusmoney;
            }
        } else {
            Money minusmoney = new Money(0, 0);
            return minusmoney;
        }
    }

    public boolean less(Money compared) {
        if (((this.euros * 100) + this.cents) < ((compared.euros * 100) + compared.cents)) {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
