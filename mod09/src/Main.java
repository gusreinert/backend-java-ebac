import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor:");

        int valueP = scanner.nextInt();
        System.out.printf("Primitivo = %d\n", valueP);

        Integer valueW = Integer.valueOf(valueP);
        System.out.printf("Wrapper = %d\n", valueW);
    }
}