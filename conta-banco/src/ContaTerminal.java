import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem-vindo ao bando digital! Vamos realizar o cadastro, primeiro, qual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Ok, " + nome + " digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Agora, digite o número da conta, por favor!");
        int conta = scanner.nextInt();
        
        System.out.println("Ok, agora digite o saldo inicial para a conta!");
        double saldo = scanner.nextDouble();
        scanner.close();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque!");
        
    }
}
