package day_06;

import java.util.Arrays;
import java.util.Scanner;

public class C03_MDA {
           /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int arr[][]={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */
           public static void main(String[] args) {
             int arr[][]=new int[3][2];
               System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]
               Scanner scan=new Scanner(System.in);

               for (int i = 0; i < arr.length ; i++) {//bu loop dıstaki arrayın elemanlarını tek tek alır

                   for (int j = 0; j <arr[i].length ; j++) {//bu loop iç arrayların elemanlarını tek tek alır

                       //arr[0][0]
                       System.out.println("Lutfen eklemek istediğiniz sayıyı giriniz");
                       arr[i][j]= scan.nextInt();
                   }
               }

               System.out.println(Arrays.deepToString(arr));// [[1, 5], [3, 7], [8, 4]]

               int brr[]=new int[arr.length];


               for (int i = 0; i < arr.length ; i++) {//dıs array için

                   int toplam=0;
                   for (int j = 0; j <arr[i].length ; j++) {//iç array için

                      toplam=toplam+ arr[i][j];
                   }


                   brr[i]=toplam;
               }

               System.out.println(Arrays.toString(brr));


           }

}
