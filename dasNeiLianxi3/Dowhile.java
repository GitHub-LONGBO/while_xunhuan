/**
 * Created by asus on 2016/5/1.
 */ import  java.util.Scanner;
public class Dowhile {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 1000 + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println(a);

      int b ;

        do{ System.out.println("���������֣�");
            b = scanner.nextInt();
            if (b==0) {
                System.out.println("GameOver");
                break;
            } else if (a < b) {
                System.out.println("����̫�󣬲���");

            } else  {
                System.out.println("����̫С������");
            }

        }
        while (a != b);
        if (b == a) {
            System.out.println("��ϲ������");

        }
    }
}
