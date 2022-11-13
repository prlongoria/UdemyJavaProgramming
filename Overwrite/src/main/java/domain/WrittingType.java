package domain;

public enum WrittingType {//hago una enumeración de tipos de escrituras:
    CLASIC("Hand writting"),
    MODERN("Digital writting");

    //atributo:
    private final String description;

    //constructor:
    private WrittingType(String description) {
        this.description = description;
    }

    //get para recuperar la description:

    public String getDescription() {
        return description;
    }
}
