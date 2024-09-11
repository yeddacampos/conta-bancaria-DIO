import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta composto por 4 digitos:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Agora digite o número da Agência e o dígito:");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite também, seu nome completo:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por ultimo, digite o saldo da sua conta");
        double saldo = scanner.nextDouble();

        System.out.println("Estamos cadastrando sua conta em nosso banco...");

        try {
            // Pausa o programa por 3 segundos (3000 milissegundos)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Trata a exceção se a thread for interrompida durante o sono
            e.printStackTrace();
        }

      System.out.println("Olá " + nomeCliente + "! Obrigado(a) por se cadastrar em nosso banco. Segue a baixo os dados da sua conta:" + "\nNome: " + nomeCliente + "\nNúmero da conta: " + numero + "\nAgência: " + agencia + "\nSaldo: R$" + saldo);
    }
}

