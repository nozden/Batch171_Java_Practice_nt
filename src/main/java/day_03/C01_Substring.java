package day_03;

import java.util.Scanner;

public class C01_Substring {

    /*
       Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
       NOT: Yalnızca bir ad bir soyad girilmeli
       Ad ve Soyadı ilk harfleri buyuk kalanı kucuk olacak sekılde alt alta yazdırın
       Ad : Canan
       Soyad : Can
        */
    public static void main(String[] args) {
     Scanner scan =new Scanner(System.in);
     System.out.println("Lutfen ad ve soyadınızı aralarında bir bosluk olacak sekilde girin");
     String adSoyad=scan.nextLine();//next methodu sadece space'e kadar olan kısmı alır
     //space index bulurum
     //0dan spaceind kadar olan kısmı substrıng ile alırım
     int spaceIndex=adSoyad.trim().indexOf(" ");
     //substring methodunun 2 formu var
     //1. substring(index) -> yazılan indexten stringin sonuna kadar olan kısmı string olarak dondurur
     //deniz-> substring(3)--> iz
     //2. substring(index1,index2) -> index1 dahil, index2 hariç olmak uzere index1den index2 ye
     // kadar olan kısım string olarak doner
     //deniz->substring(2,4)-> ni
     String ad=adSoyad.trim().substring(0,spaceIndex);
     String soyad=adSoyad.trim().substring(spaceIndex+1);
     System.out.println("Ad = " + ad);
     System.out.println("Soyad = " + soyad);
     // canan can
     char adIlkHarf=ad.toUpperCase().charAt(0);
     String adKalani=ad.substring(1).toLowerCase();
     ad=adIlkHarf+adKalani;//concatenation-> ilk harf buyuk gerisi kucuk
     char soyadIlkHarf=soyad.toUpperCase().charAt(0);
     String soyadKalan=soyad.substring(1).toLowerCase();
     soyad=soyadIlkHarf+soyadKalan;
     System.out.println("===========================================");
     System.out.println("Ad : "+ ad);
     System.out.println("Soyad : "+ soyad);












    }

}
