package day_04;

import java.util.Scanner;

public class C03_Switch {
    // Kullanıcıdan uc basamaklı pozitif bir sayı sisteme girmesini isteyiniz
    // Bu sayıyı okunuşuna çeviren bir kod yazınız.

    public static void main(String[] args) {

        /*
        125
        yuz
        yirmi
        bes
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sisteme 3 basamaklı bir sayı giriniz");
        int sayi=scan.nextInt();

        //eger kullanıcı sisteme 3 bsmklı bir sayı girmediyse hata mesajı versin ve kod bitsin

        if (sayi<100 || sayi>999)//sayının 3bsmklı olmama durumunu kontrol
        {
            System.out.println("hatalı giriş, sayı 3 basamklı olmalı");
        }else{
            //%a ifadesi sayının a'ya bolumunden kalanı verir
            int birler=sayi%10;
            int onlar=(sayi/10)%10;
            int yuzler=sayi/100;

            switch (yuzler){
                case 1 :
                    System.out.println("Yuz");break;
                case 2:
                    System.out.println("Iki yuz");break;
                case 3:
                    System.out.println("Uc yuz");break;
                case 4 :
                    System.out.println("Dort yuz");break;
                case 5:
                    System.out.println("Bes yuz");break;
                case 6:
                    System.out.println("Alti yuz");break;
                case 7:
                    System.out.println("Yedi yuz");break;
                case 8:
                    System.out.println("Sekiz yuz"); break;
                case 9:
                    System.out.println("Dokuz yuz");break;
            }

            switch (onlar){
                case 1 :
                    System.out.println("On");break;
                case 2:
                    System.out.println("Yirmi");break;
                case 3:
                    System.out.println("Otuz");break;
                case 4 :
                    System.out.println("Kirk");break;
                case 5:
                    System.out.println("Elli");break;
                case 6:
                    System.out.println("Altmis");break;
                case 7:
                    System.out.println("Yetmis");break;
                case 8:
                    System.out.println("Seksen"); break;
                case 9:
                    System.out.println("Doksan");break;

            }

            switch (birler){

                case 1 :
                    System.out.println("Bir");break;
                case 2:
                    System.out.println("Iki");break;
                case 3:
                    System.out.println("Uc");break;
                case 4 :
                    System.out.println("Dort");break;
                case 5:
                    System.out.println("Bes");break;
                case 6:
                    System.out.println("Alti");break;
                case 7:
                    System.out.println("Yedi");break;
                case 8:
                    System.out.println("Sekiz"); break;
                case 9:
                    System.out.println("Dokuz");break;
            }

        }
    }
}
