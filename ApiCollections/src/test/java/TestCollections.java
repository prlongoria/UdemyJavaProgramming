import java.util.*;//Debo fijarme y poner aquí el * para que se importe la interface de List

//CUando hago un método genérico, meter como argumentos la clase más genérica que es la padre o la que menos
// argumentos tiene

//Set y List heredan el método add de la clase Collection, y las clases Hashset y arrayList implementan el método add,
// y este método puede recibir cualquier tipo Object. Las operaciones de set son más rápidas que en un List

//En le tipo List se pueden duplicar los elementos

public class TestCollections {


    //Interface LIST:
    public static void main(String[] args) {
        //creo un objeto de la interface List:una lista guarda el orden de los elementos que voy agregando
        List myList = new ArrayList();
        myList.add("Monday");//al método add en este caso puedo agregar cualquier tipo de argumento, String, int o lo que sea
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Friday");//veo que se puede duplicar sin problema
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");


        //foreach:
        for(Object element: myList) {
            System.out.println ("Element foreach List: " + element);//me la imprime por orden y no tengo restricción de la cantidad de elementos
            // que puedo añadir a myList
        }

        //En lugar de un ciclo forEach puedo usar una función flecha:
        myList.forEach(element -> {//todos los elementos son de tipo objetc
            System.out.println("Element con función flecha List: " + element);
        });

        print(myList);//la mejor práctica es usar el método print
    //}



    //Interface SET:no mantiene el orden de los elementos
    //public static void main(String[] args) {
        Set mySet = new HashSet();//no suele mantener el orden de introducción de los elementos
        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        mySet.add("Friday");
        mySet.add("Saturday");
        mySet.add("Sunday");
        mySet.add("Friday");//aunque haga esto, no me lo va a imprimir, lo deshecha automáticamente

        print(mySet);

        //Para trabajar con interface tipo Map:
        Map myMap = new HashMap();//Map utiliza HashMap y el método put(Object key, Object value) en lugar de add:
        myMap.put("Value1", "Juan");
        myMap.put("Value2", "Karla");
        myMap.put("Value3", "Rosario");

        //String element = myMap.get("value1");//Esto devuelve un tipo Object pero quiero un String, así que debo hacer
        // un downcast:

        String element =(String) myMap.get("Value1");

        System.out.println("element = " + element);//imprime Juan pues le pido la llave "Value1", en este caso no puedo
        // usar el método print(element), porque element es String y print requiere argumentos de las interfaces

        //Y si quiero recuperar todas las llaves:

        print(myMap.keySet());//así imprime Value1, Value2, Value3
        //O bien:
        print(myMap.values());//así imprime Rosario, Juan, Karla


    }
    //voy a aplicar polimorfismo:

    public static void print(Collection collection){//Cojo el tipo de interface más genérico:la interface Collection
        // que es el padre de todas y está también en el paquete java.util

        for (Object element: collection){
            System.out.println("element con print y foreach= " + element);
        }
        //En lugar de un ciclo forEach puedo usar una función flecha:
        collection.forEach(element -> {//todos los elementos son de tipo object
            System.out.println("Element con función flecha y print: " + element);
        });

    }

}
