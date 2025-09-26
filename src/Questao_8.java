import java.util.Locale;
import java.util.Scanner;

public class Questao_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();
        int fat = 1;

        for (int i = 1; i <= N; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.nextLine();
    }
}
