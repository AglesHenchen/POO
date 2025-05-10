package Questoes;

public class Questao05 extends BaseQuestao  {
    private int qtdMorango;
    private int qtdMaca;
    private double valorTotal;

    public int getQtdMorango() {
        return qtdMorango;
    }

    public void setQtdMorango(int qtdMorango) {
        this.qtdMorango = qtdMorango;
    }

    public int getQtdMaca() {
        return qtdMaca;
    }

    public void setQtdMaca(int qtdMaca) {
        this.qtdMaca = qtdMaca;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public void Executar() {

        System.out.println("------------- Questão 05 -------------\n");
        
        System.out.println("          |   Até 5 Kg        |   Acima de 5 Kg");
        System.out.println("Morango:  |   R$ 7,50 p/Kg    |   R$ 5,30 p/Kg");
        System.out.println("Maçã:     |   R$ 3,50 p/Kg    |   R$ 2,80 p/Kg \n");

        System.out.print("Informe quantos kg de morango deseja comprar: ");
        qtdMorango = scanner.nextInt();
        System.out.print("Informe quantos kg de maçã deseja comprar: ");
        qtdMaca = scanner.nextInt();

        valorTotal = calcularCompra(qtdMorango, qtdMaca);
        System.out.println("\nValor total da compra: R$" + valorTotal);

        System.out.println("--------------------------------------\n");

    }

    public Double calcularCompra(int qtdMorango, int qtdMaca) {
        double valorMorango, valorMaca;

        valorMorango = (qtdMorango <= 5) ? 7.50 : 5.30;
        valorMaca = (qtdMaca <= 5) ? 3.50 : 2.80;

        valorTotal = (qtdMorango * valorMorango) + (qtdMaca * valorMaca);

        if (qtdMorango + qtdMaca <= 5 && valorTotal >= 19.00) {
            valorTotal = valorTotal - (valorTotal * 0.08);
        }

        return valorTotal;
    }


    
}
