package domain;

import java.util.Objects;

//Esta es la clase padre. Laosbreescritura significa que la clase hija puede sobreescribir a la case padre
public class Employee {
    protected String name;
    protected double salary;

    //Constructor público para poder usarlo desde otras clases:
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public String obtainDetails() {//hago este método así para simular el método toString y poder hacer la
        // sobreescritura desde la clase hija, pero haré el toString cuando quiera hacer la conversión de objetos
        return "Name: " + this.name + ", salary: " + this.salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {//para que me salga esto al llamar al método de esta clase, sino saldría simplemente el
        // objeto, sin sus valores
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.getSalary(), getSalary()) == 0 && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSalary());
    }
}
