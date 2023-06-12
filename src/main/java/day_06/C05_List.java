package day_06;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

             /*
          İki Array'de ortak bulunan elementleri bir list'e ekleyiniz ve list'i yazdırınız.
          (case sensitivity olmadan)

          String[] arr = {"John","Brad","Angel","Sofia","Emily"};

          String[] brr = {"sofia","brad","grace","emily","hazel"};

          Output : [Brad,Sofia,Emily]

         */
             public static void main(String[] args) {

                 String[] arr = {"John","Brad","Angel","Sofia","Emily"};

                 String[] brr = {"sofia","brad","grace","emily","hazel"};

                 List<String> ortakIsimler=new ArrayList<>();

                 for (int i = 0; i < arr.length ; i++) { //arr'deki elemanlar tek tek gelecek

                     for (int j = 0; j < brr.length ; j++) {//brrdeki elemanlar tek tek gelecek

                         if (arr[i].equalsIgnoreCase(brr[j])){

                             //ortakIsimler.add(arr[i]);
                             //[Brad, Sofia, Emily]
                             ortakIsimler.add(brr[j]);
                             //[brad, sofia, emily]
                         }
                     }

                 }

                 System.out.println(ortakIsimler);

             }
}
