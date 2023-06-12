package day_05;

import java.util.Scanner;

public class C02_NestedForLoop {
        /*
    Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
    ve ardından aşağıdaki şekli bu sayıya göre yazdırın:

    örnegin: Satır Sayısı 4 icin;

     1
     2 3
     4 5 6
     7 8 9 10

     */
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Lutfen satır sayısını giriniz");
            int satir=scan.nextInt();

            int a=1;//bu variable ucgeni olustururken kullanacagım karakteri koydugum sepet

            for (int i = 0; i <satir ; i++) {//satırlar için


                for (int j = 0; j <=i ; j++) {//sutunlar için
                    System.out.print(a+" ");
                    a++;
                }
                System.out.println();//işlevi imleci bir alt satıra gecirmek

            }


        }
}
