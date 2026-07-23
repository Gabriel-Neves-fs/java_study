import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            sc.nextLine(); // Limpar o buffer do teclado
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double somaAlturas = 0.0;
        for (int i = 0; i < n; i++) {
            somaAlturas += alturas[i];
        }

        double mediaAlturas = somaAlturas / n;

        double porcentagemMenores = 0.0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 18) {
                porcentagemMenores++;
            }
        }

        porcentagemMenores = (porcentagemMenores / n) * 100.0;

        String menoresString = "Menores de idade: \n";
        for (int i = 0; i < n; i++) {
            if (idades[i] < 18) {
                menoresString += nomes[i] + "\n";
            }
        }

        System.out.printf("Altura média: %.2f%n", mediaAlturas);
        System.out.println();
        System.out.printf("Porcentagem de pessoas menores de idade: %.1f%%%n", porcentagemMenores);
        System.out.println();
        System.out.println(menoresString);

        sc.close();
    }

}
