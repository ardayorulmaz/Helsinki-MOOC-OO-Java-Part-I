
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int price;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }

    public int priceCalc() {
        return this.squareMeters * this.pricePerSquareMeter;
    }

    public int priceDifference(Apartment otherApartment) {
        if (this.priceCalc()>otherApartment.priceCalc())
        {return (this.priceCalc() - otherApartment.priceCalc());
        }
        else return (otherApartment.priceCalc() - this.priceCalc());
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        if (this.priceCalc() > otherApartment.priceCalc()) {
            return true;
        } else {
            return false;
        }
    }
}
