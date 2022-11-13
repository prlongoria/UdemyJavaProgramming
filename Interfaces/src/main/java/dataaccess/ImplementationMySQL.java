package dataaccess;
//Esta es la clase de implementación de la interface DataAccess. Aquí obligo a agregar a esta clase el comportamiento
// definido en los métodos del crud que hice en la interface

//Se hace una clase de implementación de la interface por cada bbdd que quiera manejar

//Si metiera código en los métodos debería meter la sintaxis de MySql en este caso


//Si no quisiera implementar los métodos del crud en esta clase, la definiría como abstracta

public class ImplementationMySQL implements IDataAccess {//me coloco sobre esta linea y me sale automáticamente para
    // implementar los métodos de la interface por primera vez:(yo tendré que rellenar el cuerpo de los métodos

    @Override
    public void create() {
        System.out.println("Create desde Mysqul");
    }

    @Override
    public void read() {
        System.out.println("Read desde Mysqul");

    }

    @Override
    public void update() {
        System.out.println("Update desde Mysqul");

    }

    @Override
    public void delete() {
        System.out.println("Delete desde Mysqul");

    }
}
