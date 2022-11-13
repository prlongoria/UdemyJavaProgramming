package handleFiles;

import java.io.*;

public class HandleFiles {
    //voy a crear métodos estáticos para no tener que crear objetos de esta clase

    public static void createFile(String fileName)  {
        File file = new File(fileName);//así he creado un objeto tipo File en memoria, pero para que se guarde este
        // archivo en el disco duro debo hacer lo siguiente:

        //creo un objeto tipo PrintWriter:
        try {
            PrintWriter ouput = new PrintWriter(file);//Me pone un error y puedo bien importar la excepción
            // automáticamente, o bien hacer un try catch también automáticamente(escogí esto último porque
            // así lo hace en el video)

            //A mí automáticamente no me sale la línea siguiente, la pone él en el video:
            ouput.close();//y asi se crea el archivo en el disco duro
            System.out.println("Se ha creado el archivo");

        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e); esto me sale automáticamente, pero él hace lo siguiente:

            e.printStackTrace(System.out);
        }

        //Ahora voy a crear la clase test para esta clase
    }

    //Ahora creo un nuevo método:

    public static void writeFile(String fileName, String content) {
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(file);
            output.println(content);
            output.close();
            System.out.println("Se ha escrito en el archivo");

        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace(System.out);
        }
    }

    //Creo el método para añadir info en lugar de sobreescribirla:
    public static void addInfoToFile(String fileName, String content) {
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(new FileWriter( file, true));//al pasar true, le digo que voy
            // a hacer append a la info
            output.println(content);
            output.close();
            System.out.println("Se ha añadido contenido al archivo");

        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace(System.out);
        } catch (IOException e) {//esta la añaso automáticamente cuando me sale un error al crear el new FileWriter
            //throw new RuntimeException(e); esto es lo que me sale automáticamente, pero él pone lo siguiente:
            e.printStackTrace(System.out);
        }
    }

    //Añado el método de leer el archivo, es decir de consumirlo:
    public static void readFile(String fileName){
        var file = new File(fileName);
        //Defino ahora una variable tipo BufferReader que sirve para leer líneas completas del archivo( a la drcha
        // puedo ponerle var ya que por injerencia de tipos cogerá el tipo de la izda que es BufferReader, y para
        // simplificar el código es mejor ponerle var:
        try {
            var input = new BufferedReader(new FileReader(file));//me aparece un error y le doy para que se
            // haga el try catch automáticamente, también podría escoger el import de la excepción

            var lecture = input.readLine(); //utilizo este método par aleer las líneas completas, me da error y
            // la posibilidad de añadir catch y así lo hago

            //hasta aquí sólo leería la primera línea, así que debo hacer un ciclo while para leer todas las líneas:

            while (lecture != null){
                System.out.println("lecture = " + lecture);
                lecture = input.readLine();//segui´ra leyendo hasta que encuente una línea en blanco
            }
            input.close();//Para que se cierre el ciclo que abrí en var input
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace(System.out);

        } catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace(System.out);

        }
    }
}
