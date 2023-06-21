package day_08.inheritance01;

public class Parent {
    // Parent class'da isim, soyisim adında static variable olusturalım,
    // method1 ve method2 adında static methodlar olusturalım
    // yas adında instance variable olusturalım
    // method3 ve method4 adında instance methodlar olusturalım
    // olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım

   protected static String isim="Ali";

   protected static String soyisim="Can";

   protected static void method1(){
       System.out.println("Parent class static method1");
   }

   protected static void method2(){
       System.out.println("Parent class static method2");
   }

   protected int yas=30;

   protected void method3(){
       System.out.println("Parent class instance method3");
   }

   protected void method4(){
       System.out.println("Parent class instance method4");
   }

}
