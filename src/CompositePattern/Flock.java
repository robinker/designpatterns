package CompositePattern;

import AdaptorPattern.RedheadDuck;
import DecoratorPattern.DuckSimulator;
import DecoratorPattern.MallardDuck;
import DecoratorPattern.Quackable;

import java.util.ArrayList;

public class Flock {
    private ArrayList<Quackable> quackables;

    public Flock(){
        quackables = new ArrayList<>();
    }

    public void add(Quackable q){
        quackables.add(q);
    }

    public void quackAll(){
        boolean first = true;
        for (Quackable q: quackables) {
            if(q instanceof MallardDuck || q instanceof RedheadDuck){
                if(first){
                    q.quack();
                    q.quack();
                    first = false;
                }
                q.quack();
            }
        }
    }
}
