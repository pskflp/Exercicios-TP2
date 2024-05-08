package Animais;

public class Dragao extends Ave{

    public Dragao(String nome){
        super(nome);
    }

    public void cuspirFogo(){
        System.out.println("O " + getNome() + " está cuspindo fogo");


    }

}


