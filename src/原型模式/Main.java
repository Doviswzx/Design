package 原型模式;

public class Main {
    public static void main(String[]args){
        Resume a = new Resume("星星");
        a.setPersonalInfo("女", "25");
        a.setWorkExperience("1995-2004", "XX动漫公司");

        Resume b = a.clone();
        b.setWorkExperience("2001-2006", "新兴企业");

        Resume c = b.clone();
        c.setPersonalInfo("女", "20");

        a.display();
        b.display();
        c.display();
    }


}
