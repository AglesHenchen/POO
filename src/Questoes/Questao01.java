package Questoes;


public class Questao01 extends BaseQuestao {
    private int num1;
    private int num2;

    public int getNum1() {
            return num1;
        }

        public void setNum1(int num1) {
            this.num1 = num1;
        }

        public int getNum2() {
            return num2;
        }

        public void setNum2(int num2) {
            this.num2 = num2;
        }


    public void Executar() {

        System.out.println("------------- Questão 01 -------------\n");

        System.out.print("Escreva um numero inteiro: ");
        num1 = scanner.nextInt();

        System.out.print("Escreva outro numero inteiro: ");
        num2 = scanner.nextInt();

        System.out.println("");
        verificarMaior(num1, num2);

        System.out.println("--------------------------------------\n");

    }

    public void verificarMaior(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        }
        else if (num1 == num2) {
            System.out.println(num1 + " é igual ao " + num2);
        }
        else {
            System.out.println(num2 + " é maior que " + num1);
        }
    }
}
