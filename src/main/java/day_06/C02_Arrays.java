package day_06;

import java.util.Arrays;

public class C02_Arrays {
         /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' elemanları bulan bir kod yazınız.
        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, ikincimax: 8787
       */
         public static void main(String[] args) {

             int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
             //int arr[]= iki sekilde de olur
             //sort methodu arrayi natural ordera gore sıralar
             //natural order yani alfabetik veya kucukten buyuge sıralama

             System.out.println(Arrays.toString(arr));

             Arrays.sort(arr);//arrayı kucukten buyuge sıralamıs olduk

             System.out.println(Arrays.toString(arr));
             System.out.println("minimum : "+ arr[0]);
             System.out.println("maksimum : "+ arr[arr.length-1]);//arrayın son elemanını alırım
             System.out.println("ikinci maksimum : "+arr[arr.length-2]);//arrayın sondan ikinci elemanını alırım
         }
}
