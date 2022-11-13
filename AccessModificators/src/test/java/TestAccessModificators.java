import package1.Class1;
import package1.Class1Protected;
import packageDaughter.Class1ProtectedDaughter;

public class TestAccessModificators {
    public static void main(String[] args) {
        //Para public:
        Class1 class1 = new Class1();//así ya me va a llamar al publicConstructor e imprimirá lo que en él he puesto,
        // es decir, se ejecuta el constructor de la clase

        System.out.println("class1 = " + class1);//imprime el objeto

        System.out.println("class1 = " + class1.publicAttribute);//al poner el . y ser public el atributo puedo
        // acceder a él sin problema(imprime el valor)
           class1.publicMethod();//se ejecuta el publicMethod


        //Para protected:
        Class1Protected class1protected = new Class1Protected("Public");//para poder crear este objeto, tuve que
        // hacer un constructor público con un argumento en la clase1protected. Aquí se ejecuta el public
        // constructor de la class1protected

        System.out.println("class1protected = " + class1protected);//imrpime el objeto class1protected

        //System.out.println("class1protected = " + class1protected.protectedAttribute); Esto no puedo hacerlo si no
        // lo accedo desde la clase hija
        //class1protected.protectedMethod(); tampoco puedo hacerlo si no lo accedo desde la clase hija

        Class1ProtectedDaughter classDaughter = new Class1ProtectedDaughter();//así ya puedo acceder a todo lo protected, por el
        // constructor que hice en la clase hija. Aquí se ejecuta el constructor de la clase hija
        System.out.println("classDaughter = " + classDaughter);//imprime el objeto de la clase hija

        //Para default:
        //no puedo hacerlo aquí porque para tener una clase de prueba de una clase default, debe estar en el
        // mismo paquete que ella
    }
}
