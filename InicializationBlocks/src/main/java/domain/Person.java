package domain;
//Hay bloques de inicialización estáticos y no estáticos y se ejecutan antes del constructor

public class Person {
    private final int idPerson;
    private static int counterPersons;

    static {//bloque de código de inicialización estático, se ejecuta antes de cualquier constructor y antes también de
        //un bloque de inicialización no estático. Este bloque sólo se ejecuta la primera vez que se carga
        // en memoria la clase
        System.out.println("Run static block");
        //aquí puedo inicializar mis variables siempre que sean static, peor no ntengo acceso al operador this:
        ++Person.counterPersons;//inicializo el contador
    }

    {//bloque de inicialización no estático, se ejecuta antes del constructor de la clase. Este bloque
        // se ejecuta cada vez que cree un objeto de mi clase
        System.out.println("Run non static block");
        //aquí sí puedo inicializar los atributos no estáticos y tengo acceso al operador this:
        this.idPerson = Person.counterPersons++;//no necesito pre-incrementar aquí el contador porque ya lo hice en el
        //bloque static

    }

    //Constructor:
    public Person() {
        System.out.println("Run constructor");
    }

    //metodo para recuperar idPerson:

    public int getIdPerson() {
        return idPerson;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("idPerson=").append(idPerson);
        sb.append('}');
        return sb.toString();
    }
}
