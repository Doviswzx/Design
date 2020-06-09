package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class Secretary {
    private List<StockObserver> observers	= new ArrayList<StockObserver>();
    private String	action;

    public void attach(StockObserver observer)
    {
        observers.add(observer);
    }

    public void announce()
    {
        for (StockObserver obj : observers)
        {
            obj.update();
        }
    }

    public String getAction()
    {
        return action;
    }

    public void setAction(String action)
    {
        this.action = action;
    }
}
