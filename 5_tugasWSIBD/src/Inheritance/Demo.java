package Inheritance;

public class Demo {

    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        
        System.out.println("SuperClass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.tampilkanNilaiXY();
        
        System.out.println("SubClass");
        subOb.x = 5;
        subOb.y = 4;
        subOb.tampilkanNilaiXY();
        
        subOb.z = 50;
        subOb.tampilkanJumlah();
    }
}
