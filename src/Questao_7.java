import java.util.Locale;
import java.util.Scanner;

public class Questao_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int numerador = sc.nextInt();
            int denominador = sc.nextInt();

            if (denominador == 0) {
                System.out.println("Divisão impossivel");
            }
            else{
                double fracao = (double) numerador / denominador;
                System.out.println(fracao);
            }
        }
        sc.close();
    }
}
