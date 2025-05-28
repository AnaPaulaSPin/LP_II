
package com.mycompany.sistemabr101;


public class SistemaBR101 {

    public static void main(String[] args) {
       Pequeno moto = new Pequeno("moto", "BRT67", 2005 );
       Carga caminhao = new Carga(100,"BRT68", 2005 );
       Passeio carro = new Passeio(4,"BRT69", 2005 );
       
       Contrato cliente1 = new Contrato("Sarah", "234618-29", "Alto das margaridas", "sarah@gmail.com", "7190241");
       
       cliente1.addAutomoveis(moto);
       cliente1.addAutomoveis(caminhao);
       cliente1.addAutomoveis(carro);
       
       Data dt1 = new Data(20,11,2019);
       
       Passagem pass1 = new Passagem(dt1,"12h");
       
       moto.addPassagens(pass1);
    }
}
