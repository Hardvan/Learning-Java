
interface sampleInterface {

    void meth1();

    void meth2();
}

// Interface can extend another interface (Inheritance in Interfaces)
// Interface cannot implement another interface
interface childSampleInterface extends sampleInterface {

    void meth3();

    void meth4();
}

// class A extends sampleInterface // Error: Class can't extend interface

class MySampleClass implements childSampleInterface {

    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}

public class InheritanceInInterfaces {
    public static void main(String[] args) {

        MySampleClass obj = new MySampleClass();

        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
