import domain.Person;

public class TestForEach {
    public static void main(String[] args) {
        int ages[] = {5, 7, 10, 15};
        for (int age: ages){//así Java en automático recorre cada elemento del array
            System.out.println("age = " + age);//ya imprime todos los elementos del array, ojo que al no tener
            // un contador, no tengo acceso al índice al que estoy accediendo(para ello necesito la
            // sintaxis clásica de un ciclo for)
        }
        Person persons[] = { new Person("Juan"), new Person("Karla"), new Person("Agustin")};
        for(Person person: persons){
            System.out.println("person = " + person);
        }
    }
}
