package Dominio;

    //Base Pai - Base Identificador

public abstract class BaseIdentificador {
    
    //1 - atributos
    protected int codigo;

    //2 - metodos
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //3 - construtores
    public BaseIdentificador(int codigo) {
        this.codigo = codigo;
    }

}