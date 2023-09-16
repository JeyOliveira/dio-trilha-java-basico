import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        //TO DO: Conhecer e importar a classe scanner

        //Exibir mensagens para nosso usuário

        //Obter pela Scanner os valores digitados no terminal

        //Exibir mensagem criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome.");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número de sua agência.");
        String agencia = scanner.next();

        System.out.println("Agora, digite o número de sua conta.");
        int numeroConta = scanner.nextInt();

        double saldo = 9.99;


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é R$ " + saldo + " e já está disponível para saque.");


    }

}


