import domain.Employee;


public class TestObjectClass {


    public static void main(String[] args) {
        //comparación de dos objetos:comparo la REFERENCIA de ambos en memoria
        Employee employee1 = new Employee("Juan", 5000);//este objeto tiene una referencia de memoria
        Employee employee2 = new Employee("Juan", 3000);//este objeto tiene otra referencia de memoria

        //Cómo preguntar si dos objetos son iguales:los objetos alamcenan referencias en memoria
        if (employee1 == employee2) {//con == comparo las referencias, no los valores
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }

        //para preguntar por el CONTENIDO de los objetos:generate override methods, equals y hashscode, en la
        // clase Employee

        //Voy ahora a preguntar por el contenido y para ellos hago lo siguiente:
        if (employee1.equals(employee2)) {//el método equals se encarga de oomparar las referencias y los contenidos
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos son diferentes en contenido");
        }

        //Utilizo hashcode:si equals regresa true, hashcode regresa el mismo valor para ambos objetos
        if (employee1.hashCode() == employee2.hashCode()) {
            System.out.println("El valor hashcode es igual");
        }
        else{
            System.out.println("El valor hashcode es distinto");
        }
    }


}
