package day_06;

import java.util.Arrays;

public class C01_Arrays {
    // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
    //yeni bir array olusturmadan varolan arrayın işaretleri degişsin
    // input : 1,2,-3,4,-5,-6
    // output :-1,-2,3,-4,5,6
    public static void main(String[] args) {

        //1.yol : int arr[]=new int[6]; 6 elemanlı default degerlerden olusan bir array olusturuyoruz
        //2.yol
        int arr[]={1,2,-3,4,-5,-6};//hem deklarasyon hem de deger ataması yapıyoruz

        System.out.println(Arrays.toString(arr));//[1, 2, -3, 4, -5, -6]

        for (int i = 0; i <arr.length ; i++) {

            arr[i]=arr[i]*-1;

        }

        System.out.println(Arrays.toString(arr));//[-1, -2, 3, -4 ,5 ,6]

        int index=0;
        for (int each  : arr  ) {//foreach index yapısı olmayan dataları da destekler
            arr[index]=arr[index]*-1;
            index++;
            //each=each*-1;bu sekılde each degerini degistiriz fakat arrde yerine koymadıgımız için arr guncellenmez
        }

        System.out.println(Arrays.toString(arr));





    }
}
