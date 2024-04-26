import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de criação de contas");
        System.out.println("Por favor, digite o número da Agência");
        contaTerminal.setAgencia(Integer.parseInt(ler.nextLine()));
        System.out.println("Por favor, digite o número da conta");
        contaTerminal.setNumero(ler.nextLine());
        System.out.println("Por favor, digite o nome do cliente");
        contaTerminal.setNomeCliente(ler.nextLine());
        System.out.println("Por favor, digite o saldo da conta");
        contaTerminal.setSaldo(new BigDecimal(ler.next()));
        contaTerminal.dadosCliente();
    }
}