package day_07;

public class C06_Varargs {

    // kac tane kelime verilirse verilsin
    // iclerinden en uzun olanı yazdıran bir method olusturun
    // bu methodun access modifier'ını public yapıp aynı packagagedeki faklı bir classdan calıstırınız

    public static void main(String[] args) {
       String str1="Ali";
       //String str2="Abdullah";

       String str3="Ahmet";
       String str4="Veli";
       String str6="Kemal";
       //String str5="Abdurrahman";

        System.out.println(enUzunKelime(str1,str6, str3, str4));


    }

    public static String enUzunKelime(String... str) {//parametre kısmını ismi str olan bir array olarak dusunebiliriz

        String enUzunKelime="";//buldugum en uzun kelimeyi koyacagım bir konteyner olusturdum

        for (String each :str ) {//str arrayındeki her bir elemanı ele almak için loop olusturduk
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }

        return enUzunKelime;
        //methoddan elde ettiğimiz datayı yazdırmanın iki yolu vardır
        //1. return edip main methodun içinden yazdırmak
        //2. return etmeden methodun içinden yazdırmak
    }
}
