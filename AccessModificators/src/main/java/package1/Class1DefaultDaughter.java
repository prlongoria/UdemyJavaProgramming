package package1;

public class Class1DefaultDaughter extends Class1Default{
    public Class1DefaultDaughter() {

        //super();ya viene por defecto, no hace falta que lo ponga
        this.defaultAttribute = "Modification of default attribute";
        System.out.println("defaultAttribute = " + this.defaultAttribute);
        this.defaultMethod();
    }

}
