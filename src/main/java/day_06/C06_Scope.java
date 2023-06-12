package day_06;

public class C06_Scope {
    /*
    scope kapsam demektir, java için scope variableların gecerli oldugu yer anlamına gelir

    4 cesit scope vardır:

    1-static variablelar=class variable
    2-instance variable=object variable
    -- static ve instance variablelar class levelda olusturulur
    3-local variable=method içinde olusturdugumuz variablelardır
    4-loop variable=loopun içinde olusturdugumuz variablelardır

     */

    static int staticSayi;//class levelda olusturdugumuz variablelara deger ataması
                          // yapmadıgımız zaman java bunlara default degerler atar

    int instanceSayi;

    public static void main(String[] args) {

        int localSayi=4;
        for (int i = 0; i <2 ; i++) {//buradaki i loop variabledır ve loopun dısında tanınmaz
            System.out.println(i);
        }
       // System.out.println(i);
        System.out.println(staticSayi);
        //static bir variable yani class variable class içinde kullanılabiliyor
        //System.out.println(instanceSayi);
        //instance yani object variable objeye baglı oldugu için static bir methodda direk kullanılamaz

        C06_Scope obj=new C06_Scope();
        System.out.println(obj.instanceSayi);

    }
}
