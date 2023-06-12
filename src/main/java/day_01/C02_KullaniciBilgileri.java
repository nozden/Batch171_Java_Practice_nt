package day_01;

public class C02_KullaniciBilgileri {

      /*
         isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            Isim: ...
            Soyisim: ...
            Yas: ...
            Boy: ...
            Kilo: ...
    Not: Sadece bir adet "System.out.println(); kullanınız.
    */

    public static void main(String[] args) {

        String isim = "Ali";
        String soyisim = "Can";
        int yas =25;
        double boy =1.81;
        double kilo = 82.5;


        System.out.println(isim);//Isim: Ali
        System.out.println("Isim: " + isim + "\nSoyisim: "+ soyisim +"\nYas: "+ yas + "\nBoy: "+ boy +"\nKilo: "+ kilo);

        //   \ için -> alt gr + *

    }



}
