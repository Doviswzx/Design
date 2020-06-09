package 代理模式;


public class Main {
    public static void main(String[]args){
        SchoolGirl sansan = new SchoolGirl();
        sansan.setName("小阿三");

        Proxy daili = new Proxy(sansan);
        daili.givePhone();
        daili.giveWatch();
        daili.giveHat();
    }


}
