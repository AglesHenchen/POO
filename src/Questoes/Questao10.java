package Questoes;

public class Questao10 extends BaseQuestao {
    private double salarioMinimo;
    private double salarioFuncionario;
    private double impostoPago;
    private double impostoBruto;
    private double taxaImposto;
    private double impostoFinal;

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public double getImpostoPago() {
        return impostoPago;
    }

    public void setImpostoPago(double impostoPago) {
        this.impostoPago = impostoPago;
    }

    public double getImpostoBruto() {
        return impostoBruto;
    }

    public void setImpostoBruto(double impostoBruto) {
        this.impostoBruto = impostoBruto;
    }

    public double getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(double taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    public double getImpostoFinal() {
        return impostoFinal;
    }

    public void setImpostoFinal(double impostoFinal) {
        this.impostoFinal = impostoFinal;
    }

    public void Executar() {

        System.out.println("------------- Questão 10 -------------\n");

        System.out.println("Infome o valor do salário-mínimo:");
        salarioMinimo = scanner.nextDouble();

        System.out.println("Informe o número de dependentes:");
        int dependentes = scanner.nextInt();

        System.out.println("Informe o salário do funcionário:");
        salarioFuncionario = scanner.nextDouble();

        System.out.println("Informe o valor do imposto já pago pelo funcionário:");
        impostoPago = scanner.nextDouble();

        impostoBruto = calcularImpostoBruto(salarioFuncionario, salarioMinimo);

        taxaImposto = CalcularTaxaImposto(impostoBruto);

        impostoFinal = calcularImpostoFinal(impostoBruto, impostoPago);

        System.out.println("\nResultado Final dos Impostos");
        System.out.println("Numero de dependentes: " + dependentes);
        System.out.println("Imposto Bruto: R$" + impostoBruto);
        System.out.println("Taxa Adicional (4%): R$" + taxaImposto);
        System.out.println("Imposto de renda a ser pago: R$" + impostoFinal);

        System.out.println("--------------------------------------\n");

    }

    public double calcularImpostoBruto(double salarioFuncionario, double salarioMinimo) {
        salarioMinimo = salarioFuncionario / salarioMinimo;

        if (salarioMinimo > 12) {
            impostoBruto = salarioFuncionario * 0.20;
        } else if (salarioMinimo > 5) {
            impostoBruto = salarioFuncionario * 0.08;
        }

        return impostoBruto;
    }

    public double CalcularTaxaImposto(double impostoBruto) {
        return impostoBruto * 0.04;
    }

    public double calcularImpostoFinal(double impostoBruto, double impostoJaPago) {
        impostoFinal = impostoBruto + taxaImposto - impostoJaPago;
        return impostoFinal;
    }
}