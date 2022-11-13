package package1;
//Todo puede ser default, y sus hijas serán igual que las de protected, pero deben estar padre, hijas y clase
// con método main en el mismo paquete
//en este caso no necesita el constructor public
class Class1Default {
    String defaultAttribute = "value of the default attribute";

    Class1Default() {
        System.out.println("defaultConstructor ");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }
}
