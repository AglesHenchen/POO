package Questoes;

public class Questao03 extends BaseQuestao {
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void Executar() {

        System.out.println("------------- Questão 03 -------------\n");

        System.out.print("Informe a temperatura em Celsius: ");
        celsius = scanner.nextInt(); 
        celsius = Converter(celsius);

        System.out.println("\ntemperatura Convertida!");
        System.out.println("Temperatura em Fahrenheit: " + celsius);

        System.out.println("--------------------------------------\n");
    }

    public double Converter(double celsius) {
        return (celsius * 1.8) + 32;
    }

}
