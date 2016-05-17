package oop;

/**
 * Created by asus on 2016/5/17.
 */
public class chongxie {
    public static void main(String[] args) {
   teachers a = new student();
        a.jiao();



}
}
class teachers{
    int age;
    String name ;
    void jiao(){
        System.out.println("我是教学生的");
    }
}
class student extends teachers{
    int age ;
    String name ;
    void shuo(){
        super.jiao();
        System.out.println("我是来听课的");
    }
}

