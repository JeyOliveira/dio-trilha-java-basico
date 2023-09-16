import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite o numero da sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();


        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nomeCliente + " " + agencia);
        System.out.println("Tenho " + numeroConta + " anos ");
        System.out.println("Minha altura é " + saldo + "cm ");


        }

}