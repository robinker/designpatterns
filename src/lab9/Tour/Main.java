package lab9.Tour;

public class Main {
    public static void main(String[] args) {
        SingleTour tour = new SingleTour("Tour1",200,10);
        System.out.println(tour);
        PackageTour packageTour = new PackageTour("Tours");
        packageTour.getTours().add(new SingleTour("Market",50,10));
        packageTour.getTours().add(new SingleTour("Japan",5000,30));

        System.out.println(packageTour);

    }
}
