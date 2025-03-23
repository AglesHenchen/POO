package Questoes;

import java.util.Scanner;

public abstract class BaseQuestao {
    public static Scanner scanner = new Scanner(System.in); //No fim do codigo da ultima questão deve colocar -> scanner.close();
    public abstract void Executar();
}
