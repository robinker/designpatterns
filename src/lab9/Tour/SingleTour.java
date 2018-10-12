package lab9.Tour;

public class SingleTour implements Tour {

    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;

    public SingleTour(String name, double price, int allSeats) {
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getAvialableSeats() {
        return this.allSeats - this.reservedSeats;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", allSeats=" + allSeats +
                ", reservedSeats=" + reservedSeats;
    }
}
