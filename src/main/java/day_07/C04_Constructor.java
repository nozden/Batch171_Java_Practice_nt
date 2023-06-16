package day_07;

public class C04_Constructor {

    public static void main(String[] args) {

        //instance bir variable'a static bir mrthoddan ulasabilmek
        //için mutlaka obje olusturmalıyız

        C02_Constructor obj1=new C02_Constructor();//default cons
        System.out.println(obj1.marka);
        System.out.println(obj1.model);
        System.out.println(obj1.yil);
        System.out.println(obj1.yakit);

        C02_Constructor obj2=new C02_Constructor();
        obj2.marka="Mercedes";
        obj2.model="C180";
        obj2.yil=2023;
        obj2.yakit="Benzin";

        System.out.println(obj2.marka);
        System.out.println(obj2.model);
        System.out.println(obj2.yil);
        System.out.println(obj2.yakit);

        System.out.println(obj1.marka);

        //C03 e ait obje olusturalım
        C03_Constructor obj3=new C03_Constructor("Honda","Civic",2021,"Dizel");

        System.out.println(obj3.marka);
        System.out.println(obj3.model);
        System.out.println(obj3.yil);
        System.out.println(obj3.yakit);


    }


}
