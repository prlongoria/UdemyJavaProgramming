package domain;

//Utilizo clase abstract porque hay herencia ya que las clases tienen características en común, si la relación entre
// clases fuera por comportamiento, usaría una Interface

public abstract class GeometricFigure {//intelliJ me pide que la clase sea abstract o sino no me deja meterle un método
    //abstracto

    //atributo:
    protected String figureType;

    //constructor:
    protected GeometricFigure(String figureType) {
        this.figureType = figureType;
    }

    //método abstracto:proque no sé cómo se va a definir una figura geométrica, porque no sé qué figura se pedirá
    // definir en la clase hija
    public abstract void draw();

    //getters y setters:

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GeometricFigure{");
        sb.append("figureType='").append(figureType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
