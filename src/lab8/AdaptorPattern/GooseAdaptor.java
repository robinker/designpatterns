package lab8.AdaptorPattern;

public class GooseAdaptor implements Quackable{
    private Honkable honkable;

    public GooseAdaptor(Honkable honkable) {
        this.honkable = honkable;
    }

    @Override
    public void quack() {
        honkable.honk();
    }
}
