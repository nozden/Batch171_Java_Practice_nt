package day_05;

import java.util.Scanner;

public class C04_WhileLoop {
    // Kullanıcından sisteme bir sayi girmesini isteyiniz,
    // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız

    // Örn: Sayı: 41
    //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int sayi=scan.nextInt();

        //while loop
        //baslangıc degeri     sart     artış/azalış

        while (sayi%10!=0){

            System.out.print(sayi+" ");

            sayi++;
        }
    }



}
