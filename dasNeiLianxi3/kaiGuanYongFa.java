/**
 * Created by asus on 2016/5/6.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class kaiGuanYongFa {
    public static void main(String[] args) {

        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        boolean a = true;//a是一个质数
        for (int i = 2; i <b ; i++) {
            if(b%i==0){
               a=false;
                break;
            }

        }

        if(a){
            System.out.println("这是一个质数");
        }else{
            System.out.println("这不是一个质数");
        }

    }



}
