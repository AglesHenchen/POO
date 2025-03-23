import Questoes.BaseQuestao;
import Questoes.Questao01;
import Questoes.Questao02;
import Questoes.Questao03;
import Questoes.Questao04;
import Questoes.Questao05;
import Questoes.Questao06;
import Questoes.Questao07;
import Questoes.Questao08;
import Questoes.Questao09;
import Questoes.Questao10;

public class App {
    public static void main(String[] args) throws Exception {

        BaseQuestao questao01 = new Questao01();
        BaseQuestao questao02 = new Questao02();
        BaseQuestao questao03 = new Questao03();
        BaseQuestao questao04 = new Questao04();
        BaseQuestao questao05 = new Questao05();
        BaseQuestao questao06 = new Questao06();
        BaseQuestao questao07 = new Questao07();
        BaseQuestao questao08 = new Questao08();
        BaseQuestao questao09 = new Questao09();
        BaseQuestao questao10 = new Questao10();

        questao01.Executar();
        questao02.Executar();
        questao03.Executar();
        questao04.Executar();
        questao05.Executar();
        questao06.Executar();
        questao07.Executar();
        questao08.Executar();
        questao09.Executar();
        questao10.Executar();

    }
}
