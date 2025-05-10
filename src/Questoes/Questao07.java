package Questoes;

public class Questao07 extends BaseQuestao {
    private double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void Executar() {

        System.out.println("------------- Questão 07 -------------\n");

        System.out.print("Digite o valor total gasto na loja: R$ ");
        valorTotal = scanner.nextDouble();

        exibirOpcoesDePagamento(valorTotal);

        System.out.println("--------------------------------------\n");
    }

    public void exibirOpcoesDePagamento(double valorTotal) {
        int opcao;

            System.out.println("Escolha a forma de pagamento:");
            System.out.println("(Opção - 1) A vista com 10% de desconto");
            System.out.println("(Opção - 2) Em duas vezes (preço da etiqueta)");
            System.out.println("(Opção - 3) De 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$ 100,00)");

            System.out.print("\nDigite a opção desejada: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    pagamentoAVista(valorTotal);
                    break;
                case 2:
                    pagamentoDuasVezes(valorTotal);
                    break;
                case 3:
                    pagamentoComJuros(valorTotal);
                    break;
                default:
                    System.out.println("Opção inválida.\n");
                    exibirOpcoesDePagamento(valorTotal);
                    break;
            }
    }

    public void pagamentoAVista(double valorTotal) {
        double valorAVista = valorTotal - (valorTotal * 0.10);
        System.out.println("Valor total com 10%% de desconto: R$" + valorAVista);
        return;
    }

    public void pagamentoDuasVezes(double valorTotal) {
        double parceladoDuasVezes = valorTotal / 2;
        System.out.println("A compra foi dividida em duas vezes. Valor de cada parcela: R$" + parceladoDuasVezes);
        return;
    }

    public void pagamentoComJuros(double valorTotal) {

        if (valorTotal > 100) {

            System.out.print("Informe o número de parcelas entre 3 a 10 vezes: ");
            int parcelas = scanner.nextInt();

            if (parcelas < 3 || parcelas > 10) {
                System.out.println("Número de parcelas inválido.\n");
                exibirOpcoesDePagamento(valorTotal);
                return;
            } else {
                double juros = 0.03 * parcelas;
                double valorComJuros = valorTotal + (valorTotal * juros);
                double parcelaComJuros = valorComJuros / parcelas;

                System.out.printf("Valor total com 3%% de juros ao mês: R$ %.2f\n", valorComJuros);
                System.out.printf("Valor das parcelas: R$ %.2f cada\n", parcelaComJuros);
                return;
            }
        } else {
            System.out.println("A compra deve ser acima de R$ 100,00 para pagamento com juros.\n");
            exibirOpcoesDePagamento(valorTotal);
        }
    }

}
