import enumeration.Continents;
import enumeration.Days;

public class TestEnumerations {

    public static void main(String[] args) {
        System.out.println("Día 1 of week: " + Days.MONDAY);//me da el día 1 de la semana
        showWeekDay(Days.MONDAY);//me dice el número de día de la semana

        System.out.println("Continent 4: " + Continents.AMERICA);//imprime el nombre del continente
        System.out.println("Number of countries in Continent 4: " + Continents.AMERICA.getCountries());//imprime el
        // número de países del continente
        System.out.println("Population of Continent 4: " + Continents.AMERICA.getPopulation());
    }

    private static void showWeekDay(Days days) {
        switch (days) {
            case MONDAY:
                System.out.println("First day of week");
                break;
            case TUESDAY:
                System.out.println("Second day of week");
                break;
            case WEDNESDAY:
                System.out.println("Third day of week");
                break;
            case THURSDAY:
                System.out.println("Fourth day of week");
                break;
            case FRIDAY:
                System.out.println("Fifth day of week");
                break;
            case SATURDAY:
                System.out.println("Sixth day of week");
                break;
            case SUNDAY:
                System.out.println("Seventh day of week");
                break;

        }
    }
}
