import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a primeira nota:");
        float num1 = scanner.nextFloat();

        System.out.print("Informe a segunda nota:");
        float num2 = scanner.nextFloat();

        System.out.print("Informe a terceira nota:");
        float num3 = scanner.nextFloat();

        System.out.print("Informe a quarta nota:");
        float num4 = scanner.nextFloat();

        float avg = (num1 + num2 + num3 + num4) / 4;
        String sit = (avg >= 7) ? "Aprovado" : (avg >= 5) ? "Recuperação" : "Reprovado";

        System.out.format("Média = %.1f | Situação: %s", avg, sit);
    }


}