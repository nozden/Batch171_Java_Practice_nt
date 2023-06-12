package day_02;

public class C05_MethodCreation {
          /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) ve yazdıran
        bir method yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;

        System.out.println("swaptan önce sayi1 : "+ sayi1);
        System.out.println("swaptan önce sayi2 : "+ sayi2);

        //method iki sayının degerlerını degistirip  yazdıracak -> return type void

        swaplaYazdir(sayi1,sayi2);



    }

    private static void swaplaYazdir(int sayi1, int sayi2) {
        int sayi3;
        sayi3=sayi1;
        sayi1=sayi2;//sayi1 de 20 var
        sayi2=sayi3;
        System.out.println("swaptan sonra sayi1 : "+sayi1);
        System.out.println("swaptan sonra sayi2 : "+sayi2);



    }


}
