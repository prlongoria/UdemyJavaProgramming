//Hay diferentes tipos de excepciones:
// la clase throwable es la padre de todas las excepciones,
// la clase excepction es
// hija de throwable. Exception es la padre de las clases de mis programas y las clases tipo Exception serán
// CHECKEXCEPTION(deben meterse las excepciones en try catch y reportarse)

//RuntimeException:las clases que heredan de esta son UNCHECKEDEXCEPTION(el
// compilador no me obliga a utilizar). Sólo ocurren en tiempo de ejecución
//un bloque try catch ni a reportar estas excepciones)

//SQLException es otro tipo de excepción


import arithmetics.Arithmetics;

import exceptions.ExceptionOperation;

import static arithmetics.Arithmetics.division;


public class TextExceptions {
    /* ESTO ES PARA VER LA EXCEPCIÓN de arithmetics:
    public static void main(String[] args) {
        int result = 0;
        try{
            result = 10 / 0;
        }

        //Puedo agregar más de 1 bloque catch:se recomienda ejecutar las excepciones de menos gerarquía a mayor:

        catch (ExceptionOperation e){
            System.out.println("Ocurrió un error tipo ExceptionOperation");
            System.out.println(e.getMessage());
        }

        catch (Exception e){//llamo e a la excepción
            System.out.println("Ocurrió un error de tipo Exception: ");
            e.printStackTrace(System.out);//mando a imprimir la pila de excepciones (excepciones dentro de otras
            // excepciones). Pongo System.out para que se mande a imprimir en consola, aunque no es necesario ponerlo
        }

        System.out.println("result = " + result);//esto meimprime el valor de la variable que puse y también me
        // mandará la excepción que envolví en el try catch.Yy al salirme
        //en consola el error, me llevará a la línea de mi código donde tengo el error, en este caso donde hago
        // la división 10/ 0

        //lo que consigo al envolver en try catch las excepciones es que el programa no termine de manera abrupta al
        // encontrar un error que tengo previsto, sino que me avisará y continuará ejecuntándose, por eso en este caso
        // imprime la variable result después de haber encontrado el error con su excepción

        //Se puede meter aquí también un bloque llamado finally: que significa que siempre se va a ejecutar este bloque
        //independientemente de que ocurra o no una excepción:

        finally{
            System.out.println("Se revisó la división entre cero");
        }

    }
    */


    /* Para ver la excepción de manera más genérica (exceptionOperation), MEJOR PRÁCTICA:
    public static void main(String[] args) {
        int result = 0;
        try {
            result = division(10, 0);//para poder hacer esto hay que importar estes método de la clase
            // Arithmetics o bien poner Arithmetics.division(), de cualquier modo, se importa automáticamente
        }catch (Exception e){
            System.out.println("Ocurrió un error: ");
            //e.printStackTrace(System.out);//así imprimo toda la pila de excepciones
            System.out.println(e.getMessage());//así imprimo sólo el error
        }
        System.out.println("resultado = " + result);
    }

     */

    //SI quiero hacerlo con RunTimeException: el error seguirá la ejecución del código terminará de manera
    // abrupta(a diferencia de Exception con su try catch), pero el código es más limpio
    public static void main(String[] args) {
        int result = 0;
        result = Arithmetics.division(10, 0);
        System.out.println("result = " + result);
    }
}
