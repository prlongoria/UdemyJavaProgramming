import generics.GenericClass;

public class TestGenerics {
    public static void main(String[] args) {
        //ahora indico el tipo que quiero para la clase que voy a instanciar, y para ello utilizo la clase envolvente:
        GenericClass<Integer> objectInt = new GenericClass<>(15);//esto llama al constructor de esa clase

        objectInt.obtainType();//Esto imprime que el tipo T es Integer

        GenericClass<String> objectString = new GenericClass<>("Juan");//Puedo proporcionar el tipo que quiera
        // siempre que sea compatible con el valor

        objectString.obtainType();//El tipo T es String esta vez

    }
}
