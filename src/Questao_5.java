import java.util.Locale;
import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();
        int in = 0;
        int out = 0;

        for(int i=0; i < N; i++){
            int x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in += 1;
            }
            else{
                out += 1;
            }

        }
        System.out.printf("%d in%n", in);
        System.out.printf("%d out", out);

        sc.close();
    }
}
