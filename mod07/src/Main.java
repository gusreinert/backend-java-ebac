import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Gustavo");
        person.setHeight(1.90d);
        person.setWeight(93.5d);
        person.setDateOfBirth(LocalDate.of(1998, Month.FEBRUARY, 10));

        System.out.println("Name: ".concat(person.getName()).concat(System.lineSeparator()) +
                           "Height: ".concat(String.format("%.2f", person.getHeight())).concat(System.lineSeparator()) +
                           "Weight: ".concat(String.format("%.2f", person.getWeight())).concat(System.lineSeparator()) +
                           "Date of Birth: ".concat(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(person.getDateOfBirth())));
    }
}