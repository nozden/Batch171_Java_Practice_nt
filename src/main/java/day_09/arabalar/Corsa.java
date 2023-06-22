package day_09.arabalar;

public class Corsa extends Opel{
    //Corsa model arabaya ait en spesifik özellikleri bu classta tanımlayalım
    //daha sonra bu classta main method olusturup objeler uzerinden var. ve methodları cagıralım

    String hiz="Corsa max 200 km hız yapar";

    String yakit="Corsa arabalar benzinli veya elektriklidir";

    String model="Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanırlar");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakıt tuketirler");
    }

    protected void vitesSayisi(){
        System.out.println("Corsa 5 viteslidir");
    }

    public static void main(String[] args) {
        //bir tane Corsa objesi olusturalım
        //static methoddan instance datalara ulasmak için obje olustururuz

        Corsa arb1=new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket);//Araba
        System.out.println("arb1.hiz = " + arb1.hiz);//Corsa
        System.out.println("arb1.yakit = " + arb1.yakit);//Corsa
        System.out.println("arb1.marka = " + arb1.marka);//Opel
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);//Opel
        System.out.println("arb1.model = " + arb1.model);//Corsa

        arb1.motor();//Corsa

        //bir tane de opel objesi olusturalım
        Opel arb2=new Corsa();
        //data turu parent, constructor childdan gelecek sekilde de
        //obje olusturabiliriz

        System.out.println("arb2.hareket = " + arb2.hareket);//Araba
        System.out.println("arb2.hiz = " + arb2.hiz);//opel
        System.out.println("arb2.yakit = " + arb2.yakit);//araba
        System.out.println("arb2.marka = " + arb2.marka);//opel
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);

        //arb2.model --> opelde veya opelin parentinda model
        //variable olmadıgı için CTE verir

        arb2.motor();
        /*
        inheritance da variable lar;
        aramaya data turu neyse oradan baslar,
        bulamazsa parenta bakar,
        ilk buldugu yerden alır
         */
        /*
        inheritance da methodlar;
        aramaya data turu ne ise oradan baslar,
        bulamazsa parenta bakar,
        ilk buldugunu almaz
        constructor'ın oldugu classa kadar override edilmiş mi diye bakar
        son buldugu yerden alır
         */
        //arama işlemi variable ve methodlar için asagıdan yukarı dogrudur
        //override kontrol işlemi ise yukarıdan asagı dogrudur

        arb2.garanti();
        arb2.yakitTuketimi();//corsa
        /*
        methodlar için 2 asama var
        1. methodu arama ve bulma işlemi: asagıdan yukarı dogru
        2. bulduktan sonra asagı dogru dogru override kontrol işlemi
         */

        //arb2.vitesSayisi-->CTE

        Araba arb3=new Corsa();
        System.out.println("arb3.hareket = " + arb3.hareket);//araba
        System.out.println("arb3.hiz = " + arb3.hiz);//araba
        System.out.println("arb3.yakit = " + arb3.yakit);//araba
        //arb3.sirketMerkezi-->CTE
        System.out.println("arb3.marka = " + arb3.marka);//araba

        arb3.yakitTuketimi();//corsa
        arb3.motor();//corsa

        //arb3.garanti -->CTE
        //arb3.vitesSayisi -->CTE

        Araba arb4=new Opel();
        arb4.motor();//opel

    }
}
