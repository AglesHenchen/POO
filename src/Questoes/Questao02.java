package Questoes;


public class Questao02 extends BaseQuestao{
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    public void Executar() {

        System.out.println("------------- Questão 02 -------------\n");

        int area1, area2;

        System.out.print("Informe a base do retângulo A: ");
        base = scanner.nextInt(); 
        System.out.print("Informe a altura do retângulo A: ");
        altura = scanner.nextInt();
        area1 = calcularArea(base, altura);

        System.out.print("Informe a base do retângulo B: ");
        base = scanner.nextInt(); 
        System.out.print("Informe a altura do retângulo B: ");
        altura = scanner.nextInt();
        area2 = calcularArea(base, altura);

        System.out.println("");
        if (area1 > area2) {
            System.out.println("Área do retângulo A: "+ area1 + " cm, é maior que a do retângulo B: " + area2 + " cm");
        }
        else if (area1 == area2) {
            System.out.println("Área do retângulo A: "+ area1 + " cm, é igual a do retângulo B: " + area2 + " cm");
        }
        else {
            System.out.println("Área do retângulo B: "+ area2 + " cm, é maior que a do retângulo A: " + area1 + " cm");
        }
        
        System.out.println("--------------------------------------\n");
        
    }

    public int calcularArea(int base, int altura) {
        return base * altura;
    }
}
