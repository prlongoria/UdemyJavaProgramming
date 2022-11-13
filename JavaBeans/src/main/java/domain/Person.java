package domain;

//Esta clase la voy a hacer un JavaBean y para ellos debe cumplir:
//tener un constructor public vacío
//Sus atributos deben ser private
//Debe tener una Interface serializable: permite enviar la clase entre diferentes equipos

//Interesa que las clases sean JavaBeans para que la puedan utilizar otras tecnologías como JavaEE, hibernate, etc.

//Y debo ponerle implements Serializable

import java.io.Serializable;

public class Person implements Serializable {
    //atributos private para que sea una clase Javabean:
    private String name;
    protected String surname;

    //constructor vacío porque no sé cuántos atributos tendrán las clases que vayan a utilizar esta clase JavaBean:
    public Person() {

    }

    //si quiero puedo hacer más constructores para inicializar los atributos de la clase:
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //getter y setter para los atributos private de esta clase javabean:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //Si quiero puedo hacer toString, equals y hashcode:

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append('}');
        return sb.toString();
    }
    //ahora voy a hacer la clase de prueba
}
