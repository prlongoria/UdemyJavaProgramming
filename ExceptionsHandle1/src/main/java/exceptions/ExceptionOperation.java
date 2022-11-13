package exceptions;
//Creo esta clase para hacerla como una clase de excepción:para ello debo ponerla como hija de
// Exception o de RunTimeException.
/* Aquí hago la de Exception

public class ExceptionOperation extends Exception{//la hago hija de Exception para que sea checkexception y me pida
    // meter las excepciones en try catch

    //constructor:
    public ExceptionOperation(String message) {
        super(message);//propago el mensaje a la clase padre para que sea una clase de excepción
    }

 */

//Aquí hago la de RunTimeException:

public class ExceptionOperation extends RuntimeException {
    public ExceptionOperation(String message) {
        super(message);
    }
}


