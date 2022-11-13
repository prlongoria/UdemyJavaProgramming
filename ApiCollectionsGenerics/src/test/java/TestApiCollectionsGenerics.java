import java.util.*;

//Todo el api de Collections soporta tipos genéricos
public class TestApiCollectionsGenerics {

        //Interface LIST:
        public static void main(String[] args) {
            //creo un objeto de la interface List:una lista guarda el orden de los elementos que voy agregando
            List<String> myList = new ArrayList<>();//indico que List es de tipo String y que la ArrayList va a ser de tipo genérico
            myList.add("Monday");//Ahora el método add va a indicarme que va a manejar un tipo String ya que es lo que
            // puse arriba, lo cual es mejor porque así en tiempo de compilación hará la validación y en el
            // retorno no tendré que hacer la conversión del object al tipo que quiera
            myList.add("Tuesday");
            myList.add("Wednesday");
            myList.add("Friday");//veo que se puede duplicar sin problema
            myList.add("Thursday");
            myList.add("Friday");
            myList.add("Saturday");
            myList.add("Sunday");

            String element = myList.get(0);//ese 0 es el índice del elemento que quiero que coja. No necesito hacer
            // aquí la conversión a String como en api collection
            System.out.println("element = " + element);//Por tanto imprime Monday que es el elemento 0

            print(myList);
/*
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

*/

            //Interface SET:no mantiene el orden de los elementos

            Set<String> mySet = new HashSet<>();
            mySet.add("Monday");
            mySet.add("Tuesday");
            mySet.add("Wednesday");
            mySet.add("Thursday");
            mySet.add("Friday");
            mySet.add("Saturday");
            mySet.add("Sunday");

            print(mySet);

            //Para trabajar con interface tipo Map:
            Map<String, String> myMap = new HashMap<>();
            myMap.put("Value1", "Juan");
            myMap.put("Value2", "Karla");
            myMap.put("Value3", "Rosario");
            myMap.put("Value3", "Pepe");//sustituye el valor3 por Pepe

           // String elementMap = myMap.get("value1");

            String elementMap = myMap.get("Value1");

            System.out.println("elementMap = " + elementMap);

            //Y si quiero recuperar todas las llaves:

            print(myMap.keySet());//así imprime Value1, Value2, Value3
            //O bien:
            print(myMap.values());//así imprime Rosario, Juan, Karla

        }

        //voy a aplicar polimorfismo:

        public static void print(Collection<String> collection){//si pongo <String> ya Collection no será tipo object,
            // será para trabajar únicamente con el tipo String

            for (Object element: collection){
                System.out.println("element con print y foreach= " + element);
            }
            //En lugar de un ciclo forEach puedo usar una función flecha:
            collection.forEach(element -> {//todos los elementos son de tipo object
                System.out.println("Element con función flecha y print: " + element);
            });

        }



}


