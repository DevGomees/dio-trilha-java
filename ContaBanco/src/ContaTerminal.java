import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.printf("Agência: ");
        String agencia = sc.nextLine();

        System.out.printf("Nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.printf("Saldo na conta: ");
        double saldo = sc.nextDouble();

       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de $" + saldo + " já está disponível para saque." );


        sc.close();

    }
}
