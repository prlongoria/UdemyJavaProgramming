public class TestVarArgs {
    public static void main(String[] args) {
        printNumbers(3, 4, 5);//veo que puedo meter el número y los valores que quiera en cada llamada al
        // método con argumentos variables
        printNumbers(1, 2);
        differentParameters("Juan", 8, 9, 10);
    }

    //métodos:cuando pongo el tipo con ... significa que el método va a recibir argumentos variables, es decir,
    // que no sé cuántos elementos va a recibir hasta que se ejecute el código
    private static void printNumbers(int...numbers) {
        //de manera interna puedo tratar la variable numbers como un array:(en realidad es un tipo array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("elemento: " + numbers[i]);
        }
    }

    private static void differentParameters(String name, int...numbers) { //el argumento de varargs debe ser
        // último en ponerse
        System.out.println("name: " + name);
        printNumbers(numbers);//veo que es compatible el parámetro numbers de este método con el de prinNumbers
        // ya que ambos son argumentos variables
    }
}
