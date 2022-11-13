import domain.Employee;
import domain.Manager;
import domain.Writter;
import domain.WrittingType;

public class TestObjectsConversion {
    public static void main(String[] args) {
        Employee employee;//declaro la variable tipo Employee

        //employee = new Employee("Juan", 5000);//podría definir una variable del tipo de la clase padre, pero quiero
        //un objeto de la clase hija:
        employee = new Writter("Juan", 5000, WrittingType.CLASIC);//puedo asignar referencias de objetos de
        // clases hijas hacia tipos de la clase padre
        System.out.println("employee = " + employee);

        System.out.println(employee.obtainDetails());//aunque estoy utilizando una variable de tipo padre, estoy
        // accediendo a la info de la clase hija, debido al polimorfismo

        //employee.getwrittingType();//esto no me permite hacerlo porque este método sólo está
        // definido en la clase Writter. Debo hacer una conversión: esto es el DOWNCASTING:debo hacer una conversión
        // para poder asignar una variable de tipo padre a una variable de tipo hija
        ((Writter)employee).getWrittingType();//así sí que puedo acceder, porque he convertido a Writter el employee

        //Otra sintáxis para eldowncasting es:
        Writter writter = (Writter) employee;//con clic derecho sobre el error que marcaba, me ofrece la posibilidad
        // de hacer el casting automáticamente
        writter.getWrittingType(); //y ahora me dejaría acceder al método de nuevo

        //UPCASTING: asignar una variable tipo hija a una variable de tipo padre, no necesito hacer una conversión:
        Employee employee2 = writter; //aquí no me pide conversión
        System.out.println(employee2.obtainDetails());
    }
}
