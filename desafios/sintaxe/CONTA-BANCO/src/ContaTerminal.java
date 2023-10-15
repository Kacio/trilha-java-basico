import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //TODO: COnhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta! ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Agora digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o saldo da sua conta : ");
        double saldo = scanner.nextDouble();
        //Exibir as  mensagens para o nosso usuário

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada
        System.out.println("Olá "+nome+" "+sobrenome+", obrigado por criar uma conta em nosso banco, sua agencia é "+ numeroAgencia+ ", conta "+ numeroConta + " e seu saldo "+ saldo + " já esta disponível para saque");


    }
}
