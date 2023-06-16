package day_07;

public class C07_Varargs {

    // parametre olarak bir int
    // ve istediginiz kadar String alan bir method olusturun,
    // en uzun String'in harf sayisi ile int parametre degerini carpıp
    // sonucu yazdıranız.

    public static void main(String[] args) {

        int sayi=5;//local variable
        String str1="Zulal";
        String str2="Zeynep";
        String str3="Can";

        carpim(sayi,str1,str2,str3);

        System.out.println(C06_Varargs.enUzunKelime(str1, str2, str3));


    }

    private static void carpim(int sayi,String... str) {//eger tekli bir data ve varargsı bir arada kullanacaksak
                                                         //varargs her zaman sonda olmalıdır
        String enUzunKelime="";

        for (String each:str
             ) {

            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }

        System.out.println(enUzunKelime.length()*sayi);


    }
}
