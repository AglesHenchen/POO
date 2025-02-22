package Dominio;

    //Base filha

public class Carro extends BaseIdentificador{

    //Atributos
    private int ano;
    private String modelo;
    private String cor;
    private String fabricante;


    //Metodos
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    //Construtores

    //Tipo 1 - Basico apenas uma informação
    public Carro(int codigo) 
    {
        super(codigo);
    }

    //Tipo 2 - Completo todas as informações
    public Carro(int codigo, int ano, String modelo, String cor, String fabricante)
    {
        super(codigo);

        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.fabricante = fabricante;

    }
    
}
