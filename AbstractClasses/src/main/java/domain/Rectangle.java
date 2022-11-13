package domain;

public class Rectangle extends GeometricFigure{

    //defino constructor de esta clase:
    public Rectangle(String figureType){

        super(figureType);//llamo el constructor de la clase padre
    }

    //sobreescribo el método abstracto de la clase padre (en realidad se dice implementar el método en este caso,
    // aunque el ID me pondrá override):

    @Override
    public void draw() {
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());//así se imprime el nombre de la
        // clase dinámicamente
    }
}
