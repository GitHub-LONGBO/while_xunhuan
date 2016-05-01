/**
 * Created by asus rton 2016/5/1.
 */

 import  java.util.Scanner;
public class codethreeday {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 1000 + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println(a);
        System.out.println("请输入数字：");
        int b = scanner.nextInt();
        while (a != b) {
            if (b==0) {
                System.out.println("GameOver");
                break;
            } else if (a < b) {
                System.out.println("输入太大，不对");

            } else  {
                System.out.println("输入太小，不对");
            }
            System.out.println("请输入数字：");
                b = scanner.nextInt();
        }
        if (b == a) {
            System.out.println("恭喜你答对了");

        }
    }
}
