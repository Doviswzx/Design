package 装饰者模式;

public class Overalls extends Finery{
    @Override
    public void show() {
        super.show();
        System.out.println("银色工装裤");
    }
}
