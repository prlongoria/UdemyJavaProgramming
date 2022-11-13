package enumeration;

import java.nio.file.Path;

public enum Continents {
    AFRICA (53, "1.2 billions"),
    EUROPA(46, "1 billions"),
    ASIA(44, "1.1 billions"),
    AMERICA(34, "1 billions"),
    OCEANIA(14,"1 billions");

    private final int countries;//atributo para los elementos de la enumeración, al ser private está encapsulado
    // y necesito el método get

    private final String population;

    //defino constructor para poder utilizar esos argumentos en cada elemento de la enumeración:
    Continents(int countries, String population) {
        this.countries = countries;
        this.population = population;
    }

    //método get para los atributos countries y population:
    public int getCountries() {
        return this.countries;
    }

    public String getPopulation() {
        return this.population;
    }

    //ahora en TestEnumerations debo añadir el código que quiera
}
