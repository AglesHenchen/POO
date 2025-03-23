package Questoes;

public class Questao09 extends BaseQuestao {
    private int consumoTotal;
    private double valorConta;

    public int getConsumoTotal() {
        return consumoTotal;
    }

    public void setConsumoTotal(int consumoTotal) {
        this.consumoTotal = consumoTotal;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

    public void Executar() {

        System.out.println("------------- Questão 09 -------------\n");

        System.out.print("Informe o seu consumo de água em metros cúbicos: ");
        consumoTotal = scanner.nextInt();

        valorConta = opcaoConsumidor(consumoTotal);
        
        System.out.println("Valor Final da conta: R$" + valorConta);

        System.out.println("--------------------------------------\n");
    }

    public double opcaoConsumidor(int consumoTotal) {

        System.out.println("Escolha o tipo de consumidor:");
        System.out.println("(Opção - 1) Residencial");
        System.out.println("(Opção - 2) Comercial");
        System.out.println("(Opção - 3) Industrial");

        System.out.print("\nDigite a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                valorConta = clienteResidencial(consumoTotal);
                break;
            case 2:
                valorConta = clienteComercial(consumoTotal);
                break;
            case 3:
                valorConta = clienteindustrial(consumoTotal);
                break;
            default:
                System.out.println("Opção inválida.\n");
                break;
        }
        return valorConta;

    }

    public double clienteResidencial(int consumoTotal) {
        valorConta = 5.00 + (0.05 * consumoTotal);
        return valorConta;
    }


    public double clienteComercial(int consumoTotal) {
        if (consumoTotal <= 80) {
            valorConta = 500.00;  
            return valorConta;
        } 
        else {
            valorConta = 500.00 + (0.25 * (consumoTotal - 80)); 
            return valorConta;
        }
    }

    public double clienteindustrial(int consumoTotal) {
        if (consumoTotal <= 100) {
            valorConta = 800.00; 
            return valorConta;
        } 
        else {
            valorConta = 800.00 + (0.04 * (consumoTotal - 100));
            return valorConta;
        }
    }
   















}
