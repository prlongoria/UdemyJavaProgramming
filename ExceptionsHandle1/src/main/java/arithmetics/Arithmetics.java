package arithmetics;
//Se recomienda hacer RunTimeException para así tener un código más limpio, y ahcer sólo excepciones con try catch
// cuando estamos seguros de excepciones que pueden suceder
import exceptions.ExceptionOperation;

public class Arithmetics {
    /* Para Exception:
    //Metodo:
    public static int division(int numerator, int denominator) throws ExceptionOperation{//debo ponerle throws para
        // que pueda arrojar la excepción
        if(denominator == 0){
            throw  new ExceptionOperation("División entre cero");

        }
        return numerator / denominator;
    }

     */

    //Para RunTimeException:
    public static int division(int numerator, int denominator){
        if(denominator == 0){
            throw new ExceptionOperation("Division entre cero");
        }
        return numerator / denominator;
    }

}
