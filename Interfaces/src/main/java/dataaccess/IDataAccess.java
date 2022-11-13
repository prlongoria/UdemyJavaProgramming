package dataaccess;
//Los atributos de una interface son constantes, los métodos son abstractos y al igual que una clase abstracta,
// no puedo implementarla

//UNA INTERFACE NO TIENE CONSTRUCTORES, sólo métodos, y todos ellos deben ser abstractos y
// públicos (aunque lo pone el compilador en automático)

//Se pueden crear hijas de una Interface

public interface IDataAccess {
        //atributo:debes ser una constante y por tanto es obligatorio asignarle un valor

    int MAX_REGISTER= 10;

    //métodos: LOS MÉTODOS ABSTRACTOS NO TIENEN CUERPO
    //defino los métodos de un crud que son los que se usan cuando trabajamos con una bbdd:

    void create();//él lo llama insertar

    void read();//lo llama listar

    void update();

    void delete();

//ahora voy a hacer la implementación de la interface, pero lo haré con un mysql fake
}
