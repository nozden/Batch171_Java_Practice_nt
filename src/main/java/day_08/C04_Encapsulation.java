package day_08;

public class C04_Encapsulation {
    //C03 classına ait obje olusturun
    // Ali, Can, 25 ozelliklerine sahip bir olsun ve objeyi yazdırınız
    //objenin yasını 30 olarak guncelleyin
    //parametresiz cons kullanarak 2. bir obje olusturun
    //Ayse, Yilmaz, 40 degerlerini atayın
    //yas ı -5 olarak guncelleyin
    //yas negatif deger alamayacak sekilde set meyhodunu guncelleyin
    //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
    //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin

    public static void main(String[] args) {
        //parametreli cons kullanarak bir obje olusturalım
        C03_Encapsulation obj1=new C03_Encapsulation("ali", "Can",25);
        //System.out.println(obj1.toString());
        System.out.println(obj1);//intellij bunun obj1.toString oldugunu anlıyor
        //objenin yasını 30 olarak guncelleyin
        obj1.setYas(30);
        System.out.println(obj1);


        //parametresiz cons kullanarak 2. bir obje olusturun
        C03_Encapsulation obj2=new C03_Encapsulation();
        System.out.println(obj2);


        //Ayse, Yilmaz, 40 degerlerini atayın
        obj2.setIsim("Ayse");
        obj2.setSoyisim("Yilmaz");
        obj2.setYas(40);
        System.out.println(obj2);
        //yas ı -5 olarak guncelleyin
        obj2.setYas(-5);
        System.out.println(obj2);
        //yas negatif deger alamayacak sekilde set methodunu guncelleyin
        //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
        obj2.setIsim("ayse");
        System.out.println(obj2);
        //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin

    }
}
