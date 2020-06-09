package 代理模式;

public class Pursuit implements GiveGift {
    SchoolGirl	mm;

    public Pursuit(SchoolGirl mm)
    {
        this.mm = mm;
    }

    @Override
    public void givePhone()
    {

        System.out.println(mm.name + " 送你手机");
    }

    @Override
    public void giveWatch()
    {
        System.out.println(mm.name + " 送你手表");
    }

    @Override
    public void giveHat()
    {
        System.out.println(mm.name + " 送你帽子");
    }
}

