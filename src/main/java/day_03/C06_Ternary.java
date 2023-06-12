package day_03;

import java.util.Scanner;

public class C06_Ternary {

    public static void main(String[] args) {
        //kullanıcıdan pozitif bir sayı alınız
        //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
        // ve yazdıran bir method olusturun
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        //main method ıcınden method olustururken;
        //methodismi  +  (argument) -->uzerıne gelip create

        basamakSayisi(sayi);//argument
        //deneme methodu bana sonucu dondursun
        System.out.println(deneme(sayi));

    }

    private static String deneme(int sayi) {

       String sonuc= sayi>99 ? "uc veya daha cok basamakli" : "ucten az basamaklı";

       return sonuc;
    }

    public static void basamakSayisi(int sayi)//parametre
     {
         System.out.println(sayi > 99 ? "uc veya daha cok basamakli" : "ucten az basamaklı");

     }


}
