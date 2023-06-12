package day_05;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Arrays {
    // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
    // ve bu rakamları bir array'e assign ediniz. Olusturdugunuz array'i yazdırınız
    // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
    // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

    public static void main(String[] args) {
        int arr[]=new int[4];
        Scanner scan=new Scanner(System.in);
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Lutfen bir sayı giriniz");
            arr[i]=scan.nextInt();

        }

        System.out.println(Arrays.toString(arr));//[3, 5, 2, 7]

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
        //ortalama için arrayın elemanlarını toplayıp, arrayın uzunluguna boleriz
        double toplam=0;//3--> 3+5=8+2=10+7=17
        for (int each   : arr ) {
            toplam+=each;//toplam=toplam+each;
        }
        System.out.println("toplam = " + toplam);
        double ortalama=toplam/ arr.length;//ortalama degerinin ondalıklı kısmı atılmasın diye toplam variable'ını
                                           //double yaptım cunku double/int-->autowidening'ten double olur
        System.out.println("ortalama = " + ortalama);


        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        for (int each:arr
             ) {
            if (each>ortalama){
                System.out.print(each+" ");
            }
        }





    }

}
