package com.mycompany.app.arduino;

public class LampadaMIlGRau implements ILuminador {

    boolean ligado = false;

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void exibir(){
        if (ligado){
            System.out.println("led Acesso");            
        }else{
            System.out.println("Led Apagado!!");
        }
    }
    
    
}
