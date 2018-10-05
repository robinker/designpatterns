package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.addQuackables(new QuackEcho (new QuackCounter(new MallardDuck())));
        duckSimulator.addQuackables(new QuackEcho (new QuackCounter(new RedheadDuck())));
        duckSimulator.addQuackables(new QuackEcho (new QuackCounter(new RubberDuck())));
        duckSimulator.addQuackables(new GooseAdaptor(new Goose()));
        duckSimulator.addQuackables(new PigeonAdaptor(new Pigeon()));

        duckSimulator.simulate();
        System.out.println("The duck quacked " + QuackCounter.getNum() + " times");





    }
}
