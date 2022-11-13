public class TestAutoboxingUnboxing {
    //Autoboxing:convierto un tipo primitivo en tipo object
    //En Java cada tipo primitivo tiene una clase Wrapper o envolvente:
    //int - Integer
    //long - Long
    //float - Float
    //double - Double
    //boolean - Boolean
    //byte - Byte
    //char - Character
    //short - Short
    //las clases tienen atributos y métodos mientras que los tipos primitivos sólo almacenan un valor, así para
    // utilizar objetos, debo usar las clases envolventes cuando voy a hacer cálculos exaustivos ya que puedo hacer
    // incluso conversiones

    public static void main(String[] args) {

        //Autoboxing:
        Integer entero = 10;//así entero es un objeto(envuelvo el tipo primitivo en tipo object)
        System.out.println("entero tipo int = " + entero);//imprime 10 como objeto tipo int
        System.out.println("entero tipo String= " + entero.toString());//imprime 10 pero ya será un tipo String
        //System.out.println("entero = " + entero.);al poner ese . me salen todos los métodos a los que puedo acceder
        // por haber definido la variable como Integer en lugar de int


        //Unboxing:convierto el tipo object a tipo primitivo
        int entero2 = entero;//extraigo la literal de la variable entero que era de tipo Integer(object), es decir que
        // entero se convierte a tipo primitivo, ya no es un objeto
        System.out.println("entero2 = " + entero2);//imprime 10 pero como tipo primitivo
    }
}
