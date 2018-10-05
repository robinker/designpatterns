package DecoratorPattern;

public class PigeonAdaptor implements Quackable {
    private Cooable cooable;

    public PigeonAdaptor(Cooable cooable) {
        this.cooable = cooable;
    }

    public void quack(){
        cooable.coo();
        cooable.coo();
    }
}
