package day_08;

public class C03_Encapsulation {
        /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
     */

    private String isim;//instance

    private String soyisim;

    private int yas;

    public C03_Encapsulation(String isim, String soyisim, int yas) {
        if (isim.charAt(0)>='A'&& isim.charAt(0)<='Z'){
            this.isim = isim;}
        else {
            System.out.println("Isim buyuk harfle baslamalıdır");
        }
        this.soyisim = soyisim;
        if (yas>=0){
            this.yas = yas;}
        else {
            System.out.println("Negatif yas girilemez");
        }
    }

    public C03_Encapsulation() {
        /*
        method ile cons farkı:
        1- return type yoktur
        2- isimleri class ismi ile aynıdır, buyuk harfle baslar
         */
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        if (isim.charAt(0)>='A'&& isim.charAt(0)<='Z'){
        this.isim = isim;}
        else {
            System.out.println("Isim buyuk harfle baslamalıdır");
        }
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas>=0){
        this.yas = yas;}
        else {
            System.out.println("Negatif yas girilemez");
        }
    }

    @Override
    public String toString() {
        return "C03_Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }


}
