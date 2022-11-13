//Utilizo las mismas clases que para sobreescritura y polimorfismo para el instanceOf
//InstanceOf determina el tipo (de lo que se ha creado en new Clase() (lado derecho de la expresión con la que
//instancio una clas))e en tiempo de ejecución. Es decir, me dirá de qué tipo es el objeto que estoy creando
// (si de la clase hija o de la clase padre)

//InstanceOf también me sirve para convertir a otro tipo de dato, para poder volver a tener acceso a los atributos
// de esa clase(conversión automática al tipo de la clase que contiene el método que quiero usar)

import domain.Employee;
import domain.Manager;

public class TestInstanceOf {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 10000);
        determineType(employee);//si lo tengo solo con if saldrán Employee y Object, con else if sale sólo Employee

        employee = new Manager("Karl", 8000, "Management");
        determineType(employee);//si lo tengo con if saldrán los 3 tipos, con else if me sale sólo Manager
    }

    public static void determineType(Employee employee) {//debo preguntar siempre de clase más genérica
        // a la más restrictiva (por la clase hija)
        if(employee instanceof Manager) {//si el argumento employee apunta a un objeto en memoria de clase Manager:
            System.out.println("Es de tipo Manager");

            //Una vez que generé el get y set de department en la clase Manager:
            ((Manager) employee).getDepartment();//me doy cuenta de que al poner employee.getDepartment, me hace
            // automáticamente la conversión de employee a tipo Manager porque este método está en la clase Manager.

            System.out.println("employee = " + ((Manager) employee).getDepartment());//imprime el department del
            // employee de la clase Manager, ya que lo ha convertido automáticamente a esta clase hija.

            // También puedo hacerlo de la siguiente manera (manualmente) pero es mejor en una línea:
            //Manager manager = (Manager) employee;//convierto employee a la clase Manager yo manualmente
            //System.out.println("manager = " + manager.getDepartment());// me da la misma variable de la clase Manager



        } else if (employee instanceof Employee) {//si pusiera todo if en lugar de else-if, me diría si es de más
            // de una clase, mientras que si pongo else-if, me dice que es de la
            // primera clase que encuentre con la que coincida

            System.out.println("Es de tipo Employee");

            //si intento hacer la conversión que hice en el anterior if, me pondrá una excepción en tiempo de
            // compilación:
           // Manager manager = (Manager) employee;
            //System.out.println("manager = " + manager.getDepartment());

        }  else if (employee instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
