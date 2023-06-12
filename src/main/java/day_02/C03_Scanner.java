package day_02;

import java.util.Scanner;

public class C03_Scanner {
    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false dondursun

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayıyı giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen ikinci sayıyı giriniz");
        int sayi2=scan.nextInt();
        boolean sonuc=karelerEsitMi(sayi1,sayi2);
        System.out.println("sonuc = " + sonuc);

    }

    //access mod
    public static boolean karelerEsitMi(int a, int b){
       boolean snc= (a*a) ==  (b*b);
                //javada = isareti assignment(atama) operatorudur
               // == isareti ise matematikte kullandıgımız esıttır gibidir
        return snc;

    }


}
