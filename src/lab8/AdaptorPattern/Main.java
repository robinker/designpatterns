package lab8.AdaptorPattern;

public class Main {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.addQuackables(new MallardDuck());
        duckSimulator.addQuackables(new RedheadDuck());
        duckSimulator.addQuackables(new RubberDuck());
        duckSimulator.addQuackables(new GooseAdaptor(new Goose()));
        duckSimulator.addQuackables(new PigeonAdaptor(new Pigeon()));

        duckSimulator.simulate();
    }
}
