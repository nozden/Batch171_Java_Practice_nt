package day_03;

import java.util.Scanner;

public class C04_NestedIf {

        /*
        Kullanıcıdan sisteme bir numara girmesini isteyin.
        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.
        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.
    */
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Lutfen bir numara giriniz");
            int numara=scan.nextInt();

            if (numara<0){
                System.out.println("Negatif Sayi");
            }else{
                if (numara<10){
                    System.out.println("Rakam");
                }else{
                    System.out.println("Pozitif Sayi");
                }

            }


        }


}
