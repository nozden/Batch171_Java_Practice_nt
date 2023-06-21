package day_08.inheritance01;

public class Baby extends Child{

    int kilo=45;
    public static void main(String[] args) {
        //static variable ve methodlara direk ulasabiliriz
        method1();
        method2();
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);

        //instance datalara ulasmak için obje olusturmalıyız
        Baby obj1=new Baby();
        obj1.method3();
        System.out.println(obj1.yas);
        System.out.println(obj1.kilo);

        Child obj2=new Child();
        //obj2.kilo
        /*ilk olarak child classa bakar
        child classta kilo yok, o zaman parent a bakar
        Parentta da kilo olmadıgı için java cte verir
        cocuklara bakmaz
         */

    }
}
