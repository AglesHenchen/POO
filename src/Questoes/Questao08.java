package Questoes;

public class Questao08 extends BaseQuestao {
    private double valorInicial;

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public void Executar() {

        System.out.println("------------- Questão 08 -------------\n");

        System.out.print("informe o valor do preço inicial de fábrica do carro: ");
        valorInicial = scanner.nextDouble();

        valorInicial = adicionaisCarro(valorInicial);

        System.out.println("O valor final do carro é: R$" + valorInicial);

        System.out.println("--------------------------------------\n");
    }

    public double adicionaisCarro(double valorInicial) {
        int opcao;

        System.out.println("Escolha os adicionais do carro");
        System.out.println("(Opção - 1) Ar-condicionado: R$ 1750,00");
        System.out.println("(Opção - 2) Pintura Metálica: R$ 800,00");
        System.out.println("(Opção - 3) Vidro Elétrico: R$ 1200,00");
        System.out.println("(Opção - 4) Direção Hidráulica: R$ 2000,00");
        System.out.println("(Opção - 0) Finalizar compra");

        do {
                System.out.print("\nDigite a opção desejada: ");
                opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    valorInicial += 1750.00;
                    break;
                case 2:
                    valorInicial += 800.00;
                    break;
                case 3:
                    valorInicial += 1200.0;
                    break;
                case 4:
                    valorInicial += 2000.00;
                    break;
                case 0:
                    System.out.println("Compra finalizada\n");
                    return valorInicial;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
        return valorInicial;
    }
}
