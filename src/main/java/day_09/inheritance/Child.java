package day_09.inheritance;

public class Child extends Parent{

    protected Child(){
        //super(); child olan her classta gorunmese bile bu ifade vardır
        //bu ifade parent classtaki parametresiz cons işaret eder
        System.out.println("child class parametresiz cons");
    }

    protected Child(int a){
        super(1);
        System.out.println("child class tek parametreli cons");
    }
    //super() ifadesi her zaman ilk kod satırında olmalıdır aksi takdirde CTE verir

    protected Child(int a, int b){
        super(1,4);
        System.out.println("child class iki parametreli cons");
    }


    public static void main(String[] args) {

        //Child obj1=new Child();

        //Child obj2=new Child(1);

        Child obj3=new Child(1,5);

        /*
        Ali b=new C();
        1.Ali classının olması gerek
        2.C classının Alinin child classı olması gerek
        3.C classında parametresiz cons olmalı
         */
    }
}
