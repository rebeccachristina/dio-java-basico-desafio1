import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args){
        
        
        Scanner readScanner = new Scanner(System.in);
        
        System.out.println("Digite o numero da sua Agencia, por favor: ");
        String agencia = readScanner.next();
        readScanner.nextLine();
        
        System.out.println("Digite o numero da sua Conta, por favor: ");
        int conta = readScanner.nextInt();
        
        System.out.println("Digite o seu nome, por favor: ");
        String nomeCliente = readScanner.next();
        
        System.out.println("Digite o valor do seu saldo, por favor: ");
        double saldo = readScanner.nextDouble();
        

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agencia eh: " + agencia + ", sua conta eh: " + conta + " e seu saldo:  " + saldo + " jah estah disponivel para saque.");

        readScanner.close();

        



    }
}
