/**
 * Created by asus rton 2016/5/1.
 */

 import  java.util.Scanner;
public class codethreeday {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 1000 + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println(a);
        System.out.println("���������֣�");
        int b = scanner.nextInt();
        while (a != b) {
            if (b==0) {
                System.out.println("GameOver");
                break;
            } else if (a < b) {
                System.out.println("����̫�󣬲���");

            } else  {
                System.out.println("����̫С������");
            }
            System.out.println("���������֣�");
                b = scanner.nextInt();
        }
        if (b == a) {
            System.out.println("��ϲ������");

        }
    }
}
