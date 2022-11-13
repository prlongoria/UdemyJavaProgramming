import domain.Employee;
import domain.Manager;
//Polimorfismo significa "múltiples comportamientos", va relacionado con la sobreescritura ya que puedo hacer métodos
// más genéricos que me permitan imprimir objetos de una clase padre o de una clase hija según yo los necesite


public class TestOverwrite {
    //Esto es lo que se refiere a sobreescritura:
//    public static void main(String[] args) {
//        Manager manager1 = new Manager("Juan", 5000, "Systems");
//        System.out.println("manager1 = " + manager1.obtainDetails());//no nos imprime el atributo de department porque
        // en la clase padre no hay este atributo y yo estoy llamando al método obtainDetails de la clase padre. Así que
        // en la clase hija voy a sobreescribir este método para que pueda aparecer aquí también el department
//    }


    //Esto es lo que se refiere a Polimorfismo:
    public static void main(String[] args) {
        Employee employee1 = new Employee("Juan", 5000);

        System.out.println("Employee Class: " + employee1.obtainDetails());//Aquí imprimo lo de la clase padre porque
        // imprimo un objeto de employee

        print(employee1);//imprime lo del método print con el valor de employee1, el objeto de la clase padre

        Manager manager1 = new Manager("Karla", 3000, "accounting");
        System.out.println("Manager Class Overwriting" + manager1.obtainDetails());//aquí llamo al método de la clase hija

        print(manager1);//imprime los 3 valores, es decir, imprime manager1, el objeto de la clase hija
    }

    //Polimorfismo es lo siguiente:
    public static void print(Employee employee) {//utilizo la clase más genérica(el que menos argumentos tiene)
        // que es la clase padre para pasarle los argumentos y que siempre funcione

        System.out.println("Employee Class Polymorphism: " + employee.obtainDetails());//pero para que esto imprima,
        // debo llamar a este método print desde el método main
    }

}
