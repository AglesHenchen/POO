package Questoes;

public class Questao06 extends BaseQuestao {
    private int horaInicio;
    private int minutoInicio;
    private int horaFim;
    private int minutoFim;

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getMinutoInicio() {
        return minutoInicio;
    }

    public void setMinutoInicio(int minutoInicio) {
        this.minutoInicio = minutoInicio;
    }

    public int getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }

    public int getMinutoFim() {
        return minutoFim;
    }

    public void setMinutoFim(int minutoFim) {
        this.minutoFim = minutoFim;
    }

    
    public void Executar() {
        System.out.println("------------- Questão 06 -------------\n");

        System.out.print("Informe a hora e minuto que o jogo começou (hora minuto): ");
        horaInicio = scanner.nextInt();
        minutoInicio = scanner.nextInt();

        System.out.print("Informe a hora e minuto que o jogo terminou (hora minuto): ");
        horaFim = scanner.nextInt();
        minutoFim = scanner.nextInt();

        verificarDuracao(horaInicio, minutoInicio, horaFim, minutoFim);

        System.out.println("--------------------------------------\n");
    }
    
    public void verificarDuracao(int horaInicio, int minutoInicio, int horaFim, int minutoFim) {

        int minInicio = horaInicio * 60 + minutoInicio;
        int minFim = horaFim * 60 + minutoFim;
        
        if (minFim <= minInicio) {
            minFim += 24 * 60;
        }

        int duracaoMinutos = minFim - minInicio;

        int horasDuracao = duracaoMinutos / 60;
        int minutosDuracao = duracaoMinutos % 60;

        System.out.printf("Duração do jogo: %d horas e %d minutos", horasDuracao, minutosDuracao);
    }

}
