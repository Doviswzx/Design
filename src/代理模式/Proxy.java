package 代理模式;

public class Proxy implements GiveGift {
    Pursuit	gg;

    public Proxy(SchoolGirl mm)
    {
        gg = new Pursuit(mm);
    }

    @Override
    public void giveHat()
    {

        gg.giveHat();
    }

    @Override


    public void givePhone()
    {

        gg.givePhone();
    }

    @Override
    public void giveWatch()
    {

        gg.giveWatch();
    }
}
