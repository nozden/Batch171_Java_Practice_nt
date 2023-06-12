package day_02;

import java.util.Scanner;

public class C02_MethodCreation {
    //kullanıcıdan fahrenheit cinsi bir deger girmesini isteyin
    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8
    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

    public static void main(String[] args) {

        //kullanıcıdan veri almak icin 1-> scanner objesi olustur
        Scanner scan =new Scanner(System.in);
        //kullanıcıya bir mesaj gonderelim
        System.out.println("Lutfen fahrenheit cinsi bir sicaklik girin");
        double fahrenheit = scan.nextDouble();

        System.out.println("fahrenheit = " + fahrenheit);

        //main method icinden method olusturuken
        //methodumuza verecegimiz ismi yazıyoruz
        //method parantezinin içine argument yazıyoruz

        double celsius=fahrenheitToCelsius(fahrenheit);
        System.out.println("celsius = " + celsius);

    }

    public static double fahrenheitToCelsius(double fahrenheit) {

        double celsius=(fahrenheit-32)/1.8;
        return celsius;
    }

    /*public static double fahrToCels(double fahrenheit) {
        // formül: c = (f-32)/1.8
        double celsius=(fahrenheit-32)/1.8;
        return celsius;// return (fahrenheit-32)/1.8; bu da olurdu
    }

*/
}
