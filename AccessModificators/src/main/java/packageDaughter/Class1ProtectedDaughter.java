package packageDaughter;

import package1.Class1Protected;

public class Class1ProtectedDaughter extends Class1Protected {
    //Debo hacer un constructor para poder acceder a los atributos de la clase padre:
    public Class1ProtectedDaughter() {
        System.out.println("Constructor of ClassDaughter");
        //super();ya viene por defecto, no hace falta que lo ponga
        this.protectedAttribute = "Modification of protected attribute";
        System.out.println("protectedAttribute = " + this.protectedAttribute);//imprime este atributo justo después
        // de ejecutar el constructo de la clase hija
        this.protectedMethod();
    }
}
