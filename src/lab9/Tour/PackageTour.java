package lab9.Tour;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {
    private String packageName;
    private List<Tour> tours = new ArrayList<>();

    public PackageTour(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public String getName() {
        return this.packageName;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for(Tour t: tours)
            total += t.getPrice();
//        return tours.stream().mapToDouble(Tour::getPrice).sum();
        return total;
    }

    @Override
    public int getAvialableSeats() {
        if(tours.isEmpty())
            return 0;
        int min = tours.get(0).getAvialableSeats();
        for(Tour t: tours){
            if(t.getAvialableSeats() < min)
                min = t.getAvialableSeats();
        }
        return min;
    }

    public List<Tour> getTours() {
        return tours;
    }

    @Override
    public String toString() {
        return "packageName='" + packageName + '\'' +
                "{ tours=" + tours + '}';
    }
}
