import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int numero; //número da conta
        String agencia;
        String nomeCliente;
        float saldo;
        
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = input.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = input.nextLine();

        System.out.println("Digite o número da conta: ");
        numero = input.nextInt();

        System.out.println("Digite o saldo da conta: ");
        saldo = input.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        
    }
}

