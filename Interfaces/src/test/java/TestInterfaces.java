import dataaccess.IDataAccess;
import dataaccess.ImplementationMySQL;
import dataaccess.ImplementationOracle;

public class TestInterfaces {
    public static void main(String[] args) {
        //defino variale tipo Interface:

        IDataAccess data = new ImplementationMySQL();//creo un objeto de la implementación de mysql porque no  puedo
        // crear un objeto de la interface porque es abstracta, por eso hice la implementación de la interface, es
        // similar a clases padre e hijas

        data.read();//aquí estoy aplicando polimorfismo. En este caso el método apunta a la clase ImplementationMysql
        // porque el objeto que creé es de esta clase. Con esta línea de código ya ejecuta el método read de esa clase

        //si quiero que haga lo mismo pero de la clase de implementación de Oracle:
        IDataAccess data2 = new ImplementationOracle();

        data2.read();


        //Y si quiero usar el método genérico pint:MEJOR PRÁCTICA

        print(data);
        print(data2);
    }

    //También puedo hacer un método genérico para imprimr datos, tanto de Mysql como de Oracle: es mejor práctica
    public static void print(IDataAccess data) {
        data.read();
    }
}
