/**
 * Created by asus on 2016/5/6.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class kaiGuanYongFa {
    public static void main(String[] args) {

        System.out.println("������һ��������");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        boolean a = true;//a��һ������
        for (int i = 2; i <b ; i++) {
            if(b%i==0){
               a=false;
                break;
            }

        }

        if(a){
            System.out.println("����һ������");
        }else{
            System.out.println("�ⲻ��һ������");
        }

    }



}
