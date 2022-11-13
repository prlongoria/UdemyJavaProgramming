package package1;
//debo hacer una clase hija para poder acceder desde ella a los métodos, constructores y atributos protected
//la clase debe ser public, sus atributos, métodos y constructores pueden ser protected excepto un constructor con
// un argumento que debe ser public
public class Class1Protected {
    
    protected String protectedAttribute = "value of the protected attribute";

    protected Class1Protected() {
        System.out.println("protectedConstructor ");//se ejecuta justo después de instanciar esta clase
    }
    public Class1Protected(String arg) {//debo hacer este constructor público para poder instanciar esta clase
        // desde el método main
        System.out.println("publicProtectedClassConstructor");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");//imprime después de ejecutarse el constructor de la clase hija
    }
}
