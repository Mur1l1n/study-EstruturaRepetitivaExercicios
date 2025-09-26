import java.util.Locale;
import java.util.Scanner;

public class Questao_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(codigo != 4){
            if(codigo == 1){
                 alcool += 1;
            }
            else if(codigo == 2){
                 gasolina += 1;
            }
            else if(codigo == 3){
                 diesel += 1;
            }
            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d", diesel);

        sc.close();
    }
}
