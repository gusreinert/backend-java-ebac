import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);

        List<Person> menList = new ArrayList<>();
        List<Person> womenList = new ArrayList<>();

        do {
            System.out.print("\n1-Registrar\n2-Exibir \n3-Sair\n\nInforme o código: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Person person = new Person();
                    System.out.print("\nInforme seu nome: ");
                    person.setName(scanner.next());
                    System.out.print("Informe seu sexo (M/F): ");
                    person.setSex(scanner.next());

                    if (person.isMale()) {
                        menList.add(person);
                    } else if (person.isFemale()) {
                        womenList.add(person);
                    };
                    break;
                case 2:
                    System.out.println("\nMasculino");
                    menList.forEach((Person p) -> System.out.println(p.getName()));
                    System.out.println("\nFeminino");
                    womenList.forEach((Person p) -> System.out.println(p.getName()));
                    break;
                default:
                    if (option != 3) {
                        System.out.println("Opção inválida.");
                    }
            }
        } while (option != 3);
    }
}