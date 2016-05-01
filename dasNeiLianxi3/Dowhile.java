/**
 * Created by asus on 2016/5/1.
 */ import  java.util.Scanner;
public class Dowhile {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 1000 + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println(a);

      int b ;

        do{ System.out.println("请输入数字：");
            b = scanner.nextInt();
            if (b==0) {
                System.out.println("GameOver");
                break;
            } else if (a < b) {
                System.out.println("输入太大，不对");

            } else  {
                System.out.println("输入太小，不对");
            }

        }
        while (a != b);
        if (b == a) {
            System.out.println("恭喜你答对了");

        }
    }
}
