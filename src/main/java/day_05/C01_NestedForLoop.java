package day_05;

import java.util.Scanner;

public class C01_NestedForLoop {

    public static void main(String[] args) {

           /*
            Kullanıcıdan sisteme satır sayısını ve karakter girmesini isteyiniz.
            ve ardından kullanıcının girdiği karakteri kullanarak ikizkenar dik üçgen çizen
            bir method olusturun

            Satır sayısı = 4
            girilen karakter * ==>      *
                                        * *
                                        * * *
                                        * * * *
            */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen satır sayısını giriniz");
        int satirSayisi=scan.nextInt();

        System.out.println("Lutfen kullanmak istediğiniz karakteri giriniz");
        char ch=scan.next().charAt(0);

        ucgenCiz(satirSayisi,ch);


    }


    public static void ucgenCiz(int satirSayisi, char ch) {

        /*
        ss=3
        ch=*
       1 *
       2 * *
       3 * * *
         */

        for (int i = 0; i <satirSayisi ; i++) {//bu dongu her bir satır için calısacak

            for (int j = 0; j <=i ; j++) {//her bir karakter yazdırma işlemi için calısacak
                System.out.print(ch+" ");
            }
            System.out.println();//işlevi imleci alt satıra gecirmek
        }


    }


}
