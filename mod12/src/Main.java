import java.util.*;

public class Main {

    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\n1-Informar nomes\n2-Informar nomes-sexo\n3-Sair\n\nInforme o código: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    informarNome();
                    break;
                case 2:
                    informarNomeSexo();
                    break;
                default:
                    if (option != 3) {
                        System.out.println("Opção inválida.");
                    }
            }
        } while (option != 3);
    }

    public static void informarNome() {
        System.out.print("\nInforme nomes separados por ,:\n");
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.asList(scanner.nextLine().split(","));
        Collections.sort(list);

        System.out.print("\nLista dos nomes\n");
        list.forEach(System.out::println);
    }

    public static void informarNomeSexo() {
        System.out.print("\nInforme nomes-sexo separados por ,:\n");
        Scanner scanner = new Scanner(System.in);

        List<String> menList = new ArrayList<>();
        List<String> womenList = new ArrayList<>();

        List<String> list = Arrays.asList(scanner.nextLine().split(","));
        list.forEach((String el) -> {
            String name = el.substring(0, el.indexOf('-'));
            String sex = el.substring(el.indexOf('-') + 1);

            if (sex.equals("M")) {
                menList.add(name);
            } else if (sex.equals("F")) {
                womenList.add(name);
            }
        });

        Collections.sort(menList);
        System.out.println("\nLista dos nomes masculinos");
        menList.forEach(System.out::println);

        Collections.sort(womenList);
        System.out.println("\nLista dos nomes femininos");
        womenList.forEach(System.out::println);
    }
}