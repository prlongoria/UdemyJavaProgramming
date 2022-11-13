package dataaccess;
//Esta clase de implementación de la interface la hago si quisiera usar desde otra bbdd los métodos de la interface
//Si metiera código en los métodos debería meter la sintaxis de Oracle en este caso

public class ImplementationOracle implements IDataAccess{

    @Override
    public void create() {
        System.out.println("Create desde Oracle");

    }

    @Override
    public void read() {
        System.out.println("Read desde Oracle");

    }

    @Override
    public void update() {
        System.out.println("Update desde Oracle");

    }

    @Override
    public void delete() {
        System.out.println("Delete desde Oracle");

    }
}
