interface SampleInterface {

    void fun1();

    void fun2();
}

// Interface can extend another interface (Inheritance in Interfaces)
// Interface cannot implement another interface
interface ChildSampleInterface extends SampleInterface {

    void fun3();

    void fun4();
}

// class A extends SampleInterface // Error: Class can't extend interface

class MySampleClass implements ChildSampleInterface {

    @Override
    public void fun1() {
        System.out.println("fun1");
    }

    @Override
    public void fun2() {
        System.out.println("fun2");
    }

    @Override
    public void fun3() {
        System.out.println("fun3");
    }

    @Override
    public void fun4() {
        System.out.println("fun4");
    }
}

public class InheritanceInInterfaces {
    public static void main(String[] args) {

        MySampleClass obj = new MySampleClass();

        obj.fun1();
        obj.fun2();
        obj.fun3();
        obj.fun4();
    }
}
