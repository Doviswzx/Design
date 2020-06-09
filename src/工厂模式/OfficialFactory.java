package 工厂模式;

public class OfficialFactory implements IFactory{
    @Override
    public LeiFeng createLeiFeng() {
       return  new Official();
    }
}
