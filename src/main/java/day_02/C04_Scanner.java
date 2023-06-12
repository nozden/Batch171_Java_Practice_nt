package day_02;

import java.util.Scanner;

public class C04_Scanner {


    //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char ch=input.next().charAt(0);//scanner objesinin nextChar diye bir methodu yok
                                       //bu yuzden kullanıcının girdigi datayı once string olarak alıyorum
                                       //daha sonra bu stringin 0. indexindeki karakteri charAt(0) methodu ile alıyorum
        //String variablelarda index yapısı vardır ve index 0'dan baslar
        //charAt(0) -> sıfırıncı index yani ilk karakter demektir
        System.out.println("ch = " + ch);
        System.out.println("===============================CEVAP1====================");
        /*
          A
         A A
        A A A
         */

        //konsolda bosluk (space) yapmak için sout'un içinde space'i mutlaka "" içinde yazmalıyız
        System.out.println("  "+ch+"  ");//1.satır
        System.out.println(" "+ch+" "+ch+" ");//2.satır
        System.out.println(ch+" "+ch+" "+ch);

        System.out.println("===================CEVAP2=========================");
        // \n isareti imleci bir alt satıra gecmeye yarar ! "" içinde yazılır
        System.out.println("  "+ch+"\n "+ch+" "+ch+"\n"+ch+" "+ch+" "+ch);

    }


}
