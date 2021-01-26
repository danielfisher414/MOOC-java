
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        boolean decider = false;
        if (this.squares > compared.squares) {
            decider = true;
        }
        return decider;
    }

    public int priceDifference(Apartment compared) {
        int firstPrice = this.squares * this.pricePerSquare;
        int secondPrice = compared.squares * compared.pricePerSquare;
        int difference = 0;
        if (firstPrice > secondPrice) {
            difference = firstPrice - secondPrice;
        } else if (secondPrice > firstPrice) {
            difference = secondPrice - firstPrice;
        }
        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        boolean decider = false;
        int firstPrice = this.squares * this.pricePerSquare;
        int secondPrice = compared.squares * compared.pricePerSquare;
        if(firstPrice > secondPrice){
        decider = true;
        }

        return decider;
    }

}
