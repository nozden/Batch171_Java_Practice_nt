package day_09.arabalar;

public class Opel extends Araba{

    String hiz="Opel arabalar max 220 km hız yaparlar";

    String marka="Opel";

    String sirketMerkezi="Almanya";

    @Override
    protected void motor() {
        System.out.println("Opel arabalar Opel marka motor kullanır");
    }

    protected void garanti(){
        System.out.println("Opel arabalar 2 yil garantilidir");
    }

}
