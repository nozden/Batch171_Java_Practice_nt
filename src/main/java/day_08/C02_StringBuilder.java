package day_08;

public class C02_StringBuilder {

    public static void main(String[] args) {
        /*
        kapasitesi 7 olan bir stringbuilder objesi olusturun, capacity, lenght yazdırın
        "hava guzel" verisini ekleyin, yazdırın
        sbdeki boslugu silin
        sb'yi ters cevirin
        sbnin son 4 karakterini silin
        sbyi tekrar ters cevirin ve "Java guzel" yazısını elde edin
         */
        StringBuilder sb=new StringBuilder(7);
        System.out.println("sb.capacity() = " + sb.capacity());// 7
        System.out.println("sb.length() = " + sb.length());// 0
        sb.append("hava guzel");
        System.out.println(sb);
        //önce space karakterinin idxini bulurum sonra deleteCharAt yaparım
        int idx=sb.indexOf(" ");
        sb.deleteCharAt(idx);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        sb.delete(sb.length()-4,sb.length());
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.insert(0,"Java ");
        System.out.println(sb);


    }
}
