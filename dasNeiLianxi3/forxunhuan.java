/**
 * Created by asus on 2016/5/1.
 */import java.util.Scanner;
public class forxunhuan {
    public  static void   main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                    int a; int y =0;

        for (int i = 0; i <9; i++) {
            int count = (int) (Math.random() * 1000);
            int b = (int) (Math.random() * 1000);
            int c = b+count;
            System.out.println(b +"+"+ count + "=?");
            System.out.println("������𰸣�");
            System.out.println("�����ش�������0");
            a = scanner.nextInt();
            if(a==0){
                break;
            }
            else if(a==c) {
                System.out.println("�ش���ȷ");
                 y=y+10;
               System.out.println("��ķ����ǣ�"+y);
            }
            else{
                System.out.println("�ش����");
            }

        }
    }
}
