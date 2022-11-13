package generics;
//Voy a usar <T> para la clase, y así no voy a poner el tipo de argumentos hasta que los vaya a utilizar:

public class GenericClass<T> {//esta clase va a recibir un atributo de tipo genérico porque le he puesto <T>
    T object;

    public GenericClass(T object) {
        this.object = object;
    }
    public void obtainType(){
        System.out.println("El tipo T es: " + object.getClass().getSimpleName());//así podré saber el tipo que necesito
        // para crear una instancia de esta clase
    }
    //Ahora debo crear la clase test de esta clase
}
