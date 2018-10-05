package DecoratorPattern;

public class QuackCounter implements Quackable{
    private Quackable quackable;
    private static int num;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        this.num ++;
    }

    public static int getNum() {
        return num;
    }
}
