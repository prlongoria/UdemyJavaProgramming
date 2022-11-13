import domain.GeometricFigure;
import domain.Rectangle;

public class TestAbstractClasses {
    //No es posible instanciar clases abstractas, por lo que debo trabajar con las clases hijas de la clase abstracta
    //EN OCASIONES UNA CLASE SE MARCA COMO ABSTRACTA SÓLO PARA NO PODER CREAR OBJETOS DE ELLA, Y POR ESO NO CONTENDRÁ
    // TAMPOCO MÉTODOS ABSTRACTOS
    public static void main(String[] args) {
        //no puedo crear objetos de una clase abstracta, sino que sólo puedo trabajar con objetos de las clases hijas:

        //Voy a aplicar polimorfismo(para hacer el código más genérico): primero creo un objeto de clase GometricFigure (padre):

        GeometricFigure figure = new Rectangle("Rectangle");//puedo asignar un tipo hijo hacia un tipo hijo
        // sin tener que hacer conversiones de tipos porque el compilador me lo hace de manera automática

        //llamo al método draw:
        figure.draw();//al ser común a ambas clases, toma prioridad el de la clase más genérica, en este caso la
        // hija(Rectangle), aunque en este caso, este método en la clase padre es abstracto y aquí no podría ejecutarse


    }
}
