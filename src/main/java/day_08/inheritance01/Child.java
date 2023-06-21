package day_08.inheritance01;

public class Child extends Parent{
    // STATİC VARİABLE'LARI VE STATİC METHODLARI
    // FARKLI BİR CLASS'DAN CAGIRABİLMEK İCİN CLASS İSMİ KULLANILIR.
    // FAKAT BU İKİ CLASS ARASINDA PARENT CHİLD İLİSKİSİ VARSA,
    // DİREK KULLANILABİLİR

    int yas=10;

    public static void main(String[] args) {
       // Math.abs(1);
        Parent.method1();
        method1();
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
        isim="Veli";
        System.out.println("isim = " + isim);
        method2();

        Child obj1=new Child();
        obj1.method3();
        System.out.println("obj1.yas = " + obj1.yas);//10

        Parent obj2=new Parent();
        System.out.println("obj2.yas = " + obj2.yas);
        //java variable ararken her zaman yukarı dogru bakar
        obj2.method3();
        obj2.method4();

    }
}
