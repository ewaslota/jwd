package constructors;

public class Demo {
//    Demo(String msg) {
//    System.out.println(msg);

    //Demo() {} - nie trzeba wypisać ponieważ jest przypisany domyślnie
    //Demo demo = new Demo();

    public static void main(String[] args) {
        new B();
    }
}
class A {
    public A() {
        super();
        System.out.println("Działa konstruktor A()");
    }
    public A(String param){
        System.out.println("Działa konstruktor A()" + param + ")");
    }
}

class B extends A {
    public B() {
    //    super();
        System.out.println("Działą konstruktor B()");
    }
    public B(String param) {
    //    super(param);
        System.out.println("Działą konstruktor B()" + param + ")");
    }
}

