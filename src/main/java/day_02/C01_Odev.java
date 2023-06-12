package day_02;

public class C01_Odev {

    //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz
    //main methodun içinde tanımladıgım iki sayının kareleri toplamını bulan ve yazdıran bır method olusturun
    public static void main(String[] args) {

        int a=2;
        int b=3;

        kareToplaYazdir(a,b);//buradaki parantez içindeki variablelara argument denir
        kareToplaYazdir(6,7);

    }

    public static void kareToplaYazdir(int sayi1, int sayi2)//method parantezinin içine method body de kullanacagımız variablları tanımlıyoruz
                                        //bunlara parametre denir
    {
        int toplam=(sayi1*sayi1)+(sayi2*sayi2);
        System.out.println("toplam = " + toplam);

    }


}
