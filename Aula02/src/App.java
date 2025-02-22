import Dominio.Carro;

public class App {
    public static void main(String[] args) throws Exception {
         
        
        //Ctrl + K + C -- Coloca como comentario o que foi selecionado 
        //Tipo 1 - Basico apenas uma informação 
        /*
        Carro meu = new Carro(1);
        meu.setAno(1994);
        meu.setModelo("Polo");
        meu.setCor("Prata");
        meu.setFabricante("Volkswagen");
        */


        ////Tipo 2 - Completo todas as informações
        Carro meu = new Carro(10, 2020, "Gol", "Branco", "Volkswagen");

        System.out.println("Codigo: " + meu.getCodigo());
        System.out.println("Ano: " + meu.getAno());
        System.out.println("Modelo: " + meu.getModelo());
        System.out.println("Cor: " + meu.getCor());
        System.out.println("Fabricante: " + meu.getFabricante());


    }
}

