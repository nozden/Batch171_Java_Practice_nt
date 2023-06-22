package day_09;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C03_Set {
    // Verilen bir array'den tekrar eden elemanları silip
    // unique elemanlardan olusan bir array haline donusturen method olusturun
    // int arr[]={1,2,2,3,4,4,5};

    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5,0,7,5,1,3};
        System.out.println(Arrays.toString(arr));//[1, 2, 2, 3, 4, 4, 5, 0, 7, 5, 1, 3]

        System.out.println("benzersizYap(arr) = " + Arrays.toString(benzersizYap(arr)));
    }

    private static int[] benzersizYap(int[] arr) {
        //Set yapısı tekrarlı eleman kabul etmez
        //bu durumda verilen arrayı bir sete koymaya calısırsam bu array otomatik unique hale gelmiş olur
        System.out.println("arr nin ilk hali : "+Arrays.toString(arr));
        Set<Integer> tekrarsiz=new TreeSet<>();
        for (int each:arr
             ) {
            tekrarsiz.add(each);
        }

        System.out.println(tekrarsiz);//[0, 1, 2, 3, 4, 5, 7]
        //TreeSet dataları natural ordera gore sıralar

        int arr2[]=new int[tekrarsiz.size()];

        int idx=0;
        for (Integer each:tekrarsiz
             ) {
            arr2[idx]=each;
            idx++;
        }
        System.out.println(Arrays.toString(arr2));
        //simdi de en basta elimizde var olan arr yi arr2 degerine guncelleyelim
        arr=arr2;
        //normalde arraylerin uzunlugu degisemez di
        //arrayın uzunlugunu degıstırmenin yolu baska bir arraye esitlemektir
        System.out.println("arr nin son hali : "+Arrays.toString(arr));
        return arr;
    }
}
