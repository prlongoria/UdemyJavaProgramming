package domain;
public class Manager extends Employee {

    private String department;

    //constructor:
    public Manager(String name, double salary, String department) {
        super(name, salary);//así mando llamar al constructor de la clase padre
        this.department = department;
    }

    //Sobreescribo el método obtainDetails de la clase padre para que imprima en la clase prueba el argumento department:
    @Override
    public String obtainDetails() {
        return super.obtainDetails() + ", department: " + this.department;//super para que acceda a la clase padre, y
        // con esto ya imprime el name, salary y department
    }

    //Para el instanceOf necesito generar getter y setter del atributo department:
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
