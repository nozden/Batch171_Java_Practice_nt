package day_08;

import java.util.Scanner;

public class C01_StringBuilder {
    //kullanıcıdan aldiginiz veriyi stringbuilder objesine atayın
    //capasity lenght yazdırın
    //capasity i lenghte esıtleyın tekrar yazdırın
    //ikinci bir stringbuilder objesi olusturun, kullanıcıdaan aldıgınız veriyi atayın
    //iki objeyi karsılastırın(== , equals , compareTo ile)
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //neden obje olustururz--> instance method/variable ulasabilmek için

        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        //kullanıcını girdigi veriyi içeren bir sb olusturalım
        //ilk olarak string parametreli cons kullandım
        StringBuilder sb=new StringBuilder(kelime);
        System.out.println(sb);
        System.out.println("sb.capacity() = " + sb.capacity());
        //parametreli cons kullanarak olusturdugumuz sb objesinin kapasitesi -> 16 + parametre olarak verilen stringin uzunlugu
        //parametresiz cons kullanırsak kapasite default olarak 16 olur
        System.out.println("sb.length() = " + sb.length());
        sb.trimToSize();//bu method capasiteyi lenghte esitler
        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());

        //parametresiz cons kullanarak sb objesi olusturalım
        StringBuilder sb2=new StringBuilder();
        sb2.append(kelime);
        System.out.println(sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());
        System.out.println("sb2.length() = " + sb2.length());

        //iki objeyi karsılastırın(== , equals , compareTo ile)
        System.out.println(sb == sb2);//false
        System.out.println(sb.equals(sb2));//false-> stringbuilder daki equals methodu hem degere hem referansa bakar

        System.out.println(sb.compareTo(sb2));//0
        /*
        compareTo methodu 0 veya baska deger dondurur
        bizim için önemli olan donutun 0 olup olmaması
        0 ise iki objenin degerleri esit demektir
         */


    }
}
