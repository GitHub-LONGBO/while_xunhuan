/**
 * Created by asus on 2016/5/10.
 */import java.util.Scanner;

public class gouzao {
    int age ;
    String name;
    gouzao(int age ,String name){

        this.age = age ;
        this.name=name;
        System.out.println(name+ "  ���䣺"+age);
    }
    gouzao(){
     this(0,"0");
    }
    gouzao(int age){

        this.age = age ;
    }



    public static void changeAge(gouzao a ,int n ){
        int age = a.age-n;
        System.out.println(a.name+" �����ˣ�"+age);
    }
    public static void main(String[] args) {
        gouzao man = new gouzao(23,"��ʥ��");
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������ٵ�age: ");
        int m = scanner.nextInt();


        man.changeAge(man, m);

    }
}
