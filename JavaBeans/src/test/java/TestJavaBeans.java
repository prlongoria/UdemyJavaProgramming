import domain.Person;

public class TestJavaBeans {
    public static void main(String[] args) {
        //creo un objeto de la clase JavaBean:

        Person person = new Person();//estoy utilizando el constructor vacío de la clase Person(no necesito saber
        // cuáles son los atributos de la clase)

        //para poder asignar valores a cada atributo privado del javabean uso los setter:
        person.setName("Juan");
        person.setSurname("Pérez");

        //para imprimir los valores, puedo mandar a imprimir todo el objeto:
        System.out.println("Persona = " + person);

        //para imprimr por separado los atributos utilizo los getter:
        System.out.println("Persona nombre: " + person.getName());
        System.out.println("Persona apellido: " + person.getSurname());

    }
}
