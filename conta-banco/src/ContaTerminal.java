public class ContaTerminal {
   public static void main(String[] args) {
        // Criando o objeto Scanner para receber dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitando e capturando os dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final com concatenação de strings
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                          + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);

        // Fechando o Scanner
        scanner.close();
    }
}