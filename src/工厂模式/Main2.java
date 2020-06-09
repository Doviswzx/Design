package 工厂模式;

public class Main2 {
    public static void main(String[]args){
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();
        student.buyRice();
        student.sweep();
        IFactory gwyfactory = new OfficialFactory();
        LeiFeng gwy = gwyfactory.createLeiFeng();
        gwy.buyRice();


    }
}
