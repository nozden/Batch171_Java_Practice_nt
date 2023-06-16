package day_07;

public class C08_Overloading {

    //method signature : isim , parametreler
    //method signature aynı olan iki method olamaz
    //overloading aynı isme sahip farklı methodlar olusturma işlemidir
    //overloading için method signature degişmeli, yani isim aynı kalacagı için mecburen parametreler degısecek


    public static void main(String[] args) {

        // Aynı classta aynı isimde method olusturunuz
        //toplama methodu->int + int
        //toplama methodu->double + double
        //carpma methodu ->int*int*int
        //carpma methodu ->int*int*int*int
        //cikarma methodu->int-double
        //cikarma methodu->double-int

        toplama(3,5);
        toplama(3.2,5.1);
        //method signature degıstırmenin
        //1.yolu : parametrelerin data turunu degiştirmek

        carpma(1,2,3);
        carpma(1,2,3,4);
        //method signature degıstırmenin
        //2.yolu : parametrelerin sayısını degiştirmek

        cikarma(3,2.5);
        cikarma(5.4,3);

        //method signature degıstırmenin
        //3.yolu :data turleri farklı ise parametrelerin yerini degistirmek


    }

    private static void cikarma(double v, int v1) {
        System.out.println("Ilki double ikincisi int iki degerin farkı : "+(v-v1));
    }

    private static void cikarma(int i, double v) {
        System.out.println("Ilki int ikincisi double iki degerin farkı : "+(i-v));
    }

    private static void carpma(int a, int b, int c, int d) {

        System.out.println("dort int degerin carpımı : "+(a*b*c*d));

    }

    private static void carpma(int i, int i1, int i2) {

        System.out.println("uc int degerin carpımı : "+ (i*i1*i2));
    }

    private static void toplama(double v, double v1) {

        System.out.println("iki double degerin toplamı : "+ (v+v1));
    }

    private static void toplama(int i, int i1) {

        System.out.println("iki int degerin toplamı : "+ (i+i1));
    }
}
