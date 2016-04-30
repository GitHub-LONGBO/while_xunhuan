/**
 * Created by asus on 2016/4/30.
 */
    import java.util.Scanner;

public class codetwoday {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入循环次数："+"（次数小于5以下）");
        int conut =  scanner.nextInt();
        while(conut<10){
            System.out.println("helloWorld");

            conut++;
        }
    }
}
