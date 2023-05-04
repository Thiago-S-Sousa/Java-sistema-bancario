import java.util.Scanner;

public class Desafio {
    public static void main(String[] args){
        //dados gerais//

        String nomeCliente = "Antônio Oliveira de Jesus";
        String tipoConta = "Poupança - Digital";
        double saldoInicial = 1860.00;

        System.out.println("************************************************************");
        System.out.println(" Dados da Conta:");

        System.out.println("\n  Nome do Cliente:  " + nomeCliente);
        System.out.println("  Tipo da Conta:    " + tipoConta);
        System.out.println("  Saldo Inicial:    R$ " + saldoInicial);

        System.out.println("\n************************************************************");

        //menu de opções//
        int opcaoInfromada = 0;

        double saldoAtual = 1;
        double transferirValor = 2;
        double receberValor = 3;
        int sair = 4;

        String textMenu = """
            \n** Serviços **
            
            1 - Consultar Saldo
            2 - Transferir Valor
            3 - Receber Valor
            4-  Sair
         
            Digite a opção desejada:
            """;

        Scanner leituraOpcao = new Scanner(System.in);

        while (opcaoInfromada != sair){
                System.out.println(textMenu);
                opcaoInfromada = leituraOpcao.nextInt();

                if (opcaoInfromada == saldoAtual){
                    System.out.println("O saldo atual é de: R$ " + saldoInicial);

                } else if (opcaoInfromada == transferirValor) {
                    System.out.println("Informe o valor que deseja transferir: ");
                    double valorATransferir = leituraOpcao.nextDouble();

                    if (valorATransferir > saldoInicial){
                        System.out.println("Saldo insuficiente para realizar essa transferência, consulte o saldo atual disponível.");

                    }else {
                        saldoInicial-= valorATransferir;
                        System.out.println("Novo saldo: R$" + saldoInicial);

                    }
                } else if (opcaoInfromada == receberValor) {
                    System.out.println("Informe o valor a receber: ");
                    double valorAReceber = leituraOpcao.nextDouble();
                    saldoInicial += valorAReceber;

                    System.out.println("Novo saldo: R$" + saldoInicial);

                } else if (opcaoInfromada != 4) {
                    System.out.println("Opção inválida!");

                }
        }

    }
}
