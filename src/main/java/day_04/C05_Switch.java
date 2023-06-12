package day_04;

import java.util.Scanner;

public class C05_Switch {
    /*
  Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
  Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


  NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
       4, 6, 9, 11. aylar 30 gun çeker
       2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil = scan.nextInt();

        System.out.println("Lutfen 1-12 arası bir ay numarası girin");
        int ay = scan.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiğiniz ay 31 gun ceker");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiğiniz ay 30 gun ceker");
                break;
            case 2:
                //artık yıllarda 29 gerisinde 28 ceker
                //bir yıl artık yıl olup olmadıgını kontrol->4e tam bolunuyorsa
                if (yil % 4 == 0) {
                    System.out.println("Girdiğiniz yıl 29 gun ceker");
                } else {
                    System.out.println("Girdiğiniz yıl 28 gun ceker");
                }
                break;
            default:
                System.out.println("Gecerli bir ay numarası giriniz");

        }//ctrl + alt + L=kod hızalama

    }
}
