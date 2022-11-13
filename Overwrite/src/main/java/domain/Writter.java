package domain;

public class Writter extends Employee{//hace uso de la enumeración writtingType:
    //atributo de tipo escritura:
    final WrittingType writtingType;

    //constructor para inicializar todos los atributos de esta clase:
    public Writter(String name, double salary, WrittingType writtingType) {
        super(name, salary);//llamo al constructor de la clase padre para poder inicializar los atributos de la clase padre
        this.writtingType = writtingType;
    }

    //metodo para sobreescribir el método de la clase padre:
    @Override
    public String obtainDetails() {
        return super.obtainDetails() + ", writtingType: " + writtingType.getDescription();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Writter{");
        sb.append("writtingType=").append(writtingType);
        sb.append('}');
        sb.append(" ").append(super.toString());//llamo al toString de la clase padre para que también lo imprima aquí
        return sb.toString();
    }
    //ahora debo crear la clase de prueba

    //añado otro método a esta clase:pero voy a ver que este método no podré llamarlo desde otro sitio que no sea esta
    // clase, para ello debería hacer una conversión allá donde quiera usarlo(el la clase de test)
    public WrittingType getWrittingType() {
        return  this.writtingType;
    }
}
