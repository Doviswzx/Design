package 装饰者模式;

public class LeatherShoes extends Finery {
    public void show()
    {
        super.show();
        System.out.println("皮鞋");
    }
}
