package Hesaplamalar;

import java.util.Scanner;

public class FaktoriyelKombinasyon {
    public static void main(String[] args) {

       /* int n;
        int total=1;

        Scanner input=new Scanner(System.in);
        System.out.println("Sayi Giriniz :");
        n=input.nextInt();

        for (int i=1;i<=n; i++){
            total=total*i;
        }
        System.out.println(n+". Faktoriyel :"+total);

        */

        int n,r;
        int total1=1,total2=1,total3=1;
        int cmb;


        Scanner input=new Scanner(System.in);
        System.out.println("n Sayisini Giriniz :");
        n=input.nextInt();

        System.out.println("r Sayisini Giriniz :");
        r=input.nextInt();

        for (int i=1;i<=n; i++){
            total1=total1*i;
        }
        for (int i=1;i<=r; i++){
            total2=total2*i;
        }
        for (int i=1;i<=(n-r); i++){
            total3=total3*i;
        }
        cmb=total1/(total2*total3);
        System.out.println("Kombinasyon Sonucu : "+cmb);
    }
}
