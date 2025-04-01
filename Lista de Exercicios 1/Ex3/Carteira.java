
public class Carteira
{
   int identNum;
   float cpf;
   String tipo;
   int datValidade;
   int datExpedicao;
   int pontos;
   int situacao;
   
   void criarCarteira(int identNum, float cpf,String tipo,int datValidade, int datExpedicao){
       this.identNum = identNum;
       this.cpf = cpf;
       this.tipo = tipo;
       this.datExpedicao = datExpedicao;
       this.datValidade = datValidade;
       this.pontos = 0;
       
       
   }
   
   void acrescentarPontos(){
       
    }
    
   void consultarPontos(){
       
   }
   
   void zerarCarteira(){
       
   }
   
   void apreenderCarteira(){
       
   }
   
   void verificatValidade(){
       
   }
}
