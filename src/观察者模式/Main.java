package 观察者模式;

public class Main {

    public static void main(String[] args) {

        Boss huhansan = new Boss();

        StockObserver tongshi1 = new StockObserver("魏关姹", huhansan);
        huhansan.attach(tongshi1);
        NBAObserver tongshi2 = new NBAObserver("易管查", huhansan);
        huhansan.attach(tongshi2);
        huhansan.setAction("我胡汉三回来了！");
        huhansan.announce();

    }
}
