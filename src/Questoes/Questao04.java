package Questoes;

public class Questao04 extends BaseQuestao{
    private int alunos;
    private int alunas;

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    public int getAlunas() {
        return alunas;
    }

    public void setAlunas(int alunas) {
        this.alunas = alunas;
    }

    public void Executar() {

        System.out.println("------------- Questão 04 -------------\n");

        System.out.print("Escreva o numero de alunos: ");
        alunos = scanner.nextInt();

        System.out.print("Escreva o numero de alunas: ");
        alunas = scanner.nextInt();

        System.out.println("");
        verificarMaior(alunos, alunas);

        System.out.println("--------------------------------------\n");

    }

    public void verificarMaior(int alunos, int alunas) {
        if (alunos > alunas) {
            System.out.println("A sala possui mais alunos");
            System.out.println("Alunos: " + alunos);
            System.out.println("Alunas: " + alunas);
        }
        else if (alunos == alunas) {
            System.out.println("A sala possui a mesma quantidade de alunos e alunas");
            System.out.println("Alunos: " + alunos + " / Alunas: " + alunas);
        }
        else {
            System.out.println("A sala possui mais alunas");
            System.out.println("Alunas: " + alunas);
            System.out.println("Alunos: " + alunos);
        }
    }
    }
    
