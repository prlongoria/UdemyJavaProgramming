package package1;
//Modificadores de acceso:
// public: puede ser accedido desde cualquier clase y paquete, en cualquier parte de mi proyecto

// protected: es como private pero las hijas pueden usar lo protected de su padre. Prtected no se puede usar para
// definir las clases

// default or package(en realidad es qeu no se le pone un modificador de acceso):una clase default no puede utilizarse
// fuera del paquete en el que está, así que sus hijas tendrán que estar en el mismo paquete que ella.

// private
public class Class1 {
    public String publicAttribute = "value of the public attribute";

    public Class1() {
        System.out.println("publicConstructor ");

    }
    public void publicMethod() {
        System.out.println("Public Method");
    }



}
