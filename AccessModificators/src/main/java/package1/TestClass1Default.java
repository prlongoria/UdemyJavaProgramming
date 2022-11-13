package package1;

public class TestClass1Default {
    public static void main(String[] args) {
        Class1Default class1Default = new Class1Default();//se ejecuta ya el constructor de la clase default
        class1Default.defaultAttribute = "Modification from testdefaultClass";
        System.out.println("attribute of class1Default = " + class1Default.defaultAttribute);
        class1Default.defaultMethod();//ejecuta el método
    }
}
