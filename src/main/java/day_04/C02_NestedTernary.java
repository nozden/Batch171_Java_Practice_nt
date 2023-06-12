package day_04;

import java.util.Scanner;

public class C02_NestedTernary {

        /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */

    public static void main(String[] args) {

        //harf olup olmadıgı nasıl kontrol edilebilir
        //ascii
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sisteme bir karakter giriniz");
        char ch=scan.next().charAt(0);
        //bir karakterin harf olması için a-z veya A-Z olması gerek
        //yani (a'dan buyuk esıt ve z'den kucuk esit) veya (A'dan buyuk esıt ve Z'den kucuk esıt olmalı

        System.out.println((ch>='a'&& ch<='z')||(ch>='A' && ch <='Z') ? ((ch>='a'&& ch<='z') ? "Kucuk harf" : "Buyuk harf" ):
                ("Harf Degil"));

    }
}
