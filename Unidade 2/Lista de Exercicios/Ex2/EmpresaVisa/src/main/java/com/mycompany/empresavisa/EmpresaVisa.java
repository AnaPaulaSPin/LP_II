

package com.mycompany.empresavisa;

public class EmpresaVisa {

    public static void main(String[] args) {
        // Cliente 1: 
           Univesitario cartao1 = new Univesitario("Uneb",766,2411,2029,7000);
           Cliente cliente1 = new Cliente("Ana","62842","718023462", cartao1); 
           System.out.println("O limite do seu cartao e: " + cartao1.getLimite());
           
         // Cliente 1 esta fazendo comprinhas:
         Compra compra1 = new Compra("C&S", "Rua do limoeiro",2011, cartao1, );
           
      // Cliente 2:
       Basico cartao2 = new Basico(766,1235,2411,2029,700);
       Cliente cliente2 = new Cliente("Gabi","24542","7113952", cartao2); 
       System.out.println("O limite do seu cartao e: " + cartao2.getLimite());
       
       
       
    }
}
