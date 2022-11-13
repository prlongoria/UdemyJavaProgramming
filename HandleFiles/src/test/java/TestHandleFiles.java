import static handleFiles.HandleFiles.*;

public class TestHandleFiles {
    public static void main(String[] args) {
        //creo una variable para recibir la cadena con el nombre del archivo:
        var fileName = "prueba.txt";//aquí he puesto sólo el nombre del archivo y no he especificado la ruta de dónde
        // meterlo, pero puedo poner una ruta también: var fileName="c:\\carpeta\\prueba.txt";
        //createFile(fileName);//esto lo que ha hecho es crear en mi proyecto un archivo llamado prueba.txt

        writeFile(fileName, "Hello from Java");//esto hace que se escriba esta frase en el archivo que creé antes
        writeFile(fileName, "Add info but overwrites");//si vuelvo a llamar al método lo que hace es
        // sobreescribir lo que había puesto antes, así que para que esto no ocurra, debo hacer otro método en la clase
        // para añadir información en lugar de sobreescribirla

        addInfoToFile(fileName, "Ahora añado info a mi archivo en lugar de sobreescribirlo");

        readFile(fileName);//me imprime en pantalla cada línea que hay en el archivo
    }
}
