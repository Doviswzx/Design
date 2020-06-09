package 观察者模式;

public class StockObserver  extends Observer {
    public StockObserver(String name, Subject sub)
    {
        super(name, sub);
    }

    @Override
    public void update()
    {
        System.out.println(sub.getAction() + "	" + name + "关闭股票行情，继续工作！");
    }

}
