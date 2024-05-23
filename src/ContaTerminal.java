import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        Random random = new Random();
        DecimalFormat formatar = new DecimalFormat("0.00");

        double saldo = random.nextDouble(1000);

        System.out.println("Insira o seu nome: ");
        String nome = scanner.next();
        System.out.println("Insira o número da Agencia: ");
        int agencia = scanner.nextInt();
        System.out.println("Insira o número da conta: ");
        int conta = scanner.nextInt();
    
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + ", conta " + conta + " e seu saldo " + formatar.format(saldo) + " já está disponivel para saque.");

    }
}
