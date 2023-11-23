import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta os dados da conta
        System.out.println("Digite o número da conta: ");
        int numeroDaConta = scanner.nextInt();
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        System.out.println("Digite o nome: ");
        String nome = scanner.next();
        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Cria a conta
        Conta conta = new Conta(numeroDaConta, agencia, nome, saldo);

        // Exibe uma mensagem de boas-vindas
        System.out.println(conta.mensagemBoasVindas());
    }
}

class Conta {

    private int numeroDaConta;
    private String agencia;
    private String nome;
    private double saldo;

    public Conta(int numeroDaConta, String agencia, String nome, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String mensagemBoasVindas() {
        return "Olá " + this.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numeroDaConta + " e seu saldo R$" + this.saldo + " já está disponível para saque.";
    }
}
