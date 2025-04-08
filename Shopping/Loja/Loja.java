
public class Loja{
   private String nome;
   private String razao;
   private int numCnpj;
   private int digCnpj;
   private float fat;
   private float area;
   
   public void setnome(String nome){
       this.nome = nome;
   }
   
   public String getnome(){
       return this.nome;
    }
    
    public void setRazao(String razao){
       this.razao = razao;
   }
   
   public String getRazao(){
       return this.razao;
    }
    
    public void setNumCnpj(int numCnpj){
       this.numCnpj = numCnpj;
   }
   
   public int getNumCnpj(){
       return this.numCnpj;
    }
    
    public void setDigCnpj(int digCnpj){
       this.digCnpj = digCnpj;
   }
   
   public int getDigCnpj(){
       return this.digCnpj;
    }
    
    public void setFat(float fat){
       this.fat = fat;
   }
   
   public float getFat(){
       return this.fat;
    }
    
    public void setArea(float area){
       this.area = area;
   }
   
   public float getArea(){
       return this.area;
    }
    
   //Construtor 1
   public Loja(String nome, String razao, int numCnpj, int digCnpj){
    this.nome = nome;
    this.razao = razao;
    this.numCnpj = numCnpj;
    this.digCnpj = digCnpj;
   }

   // Construtor 2
   public Loja(String nome, String razao, int numCnpj, int digCnpj, float fat){
    this(nome,nome,numCnpj,digCnpj);

    this.fat = fat;

   }
   public void verificarFaturamente(Loja fatLoja1, Loja fatLoja2){
    if(fatLoja1.fat > fatLoja2.fat){
        System.out.print("A loja " + fatLoja1.getnome() + " possui um faturamento maior que a loja " + fatLoja2.getnome() );

    } else{
        System.out.print("A loja " + fatLoja2.getnome() + " possui um faturamento maior que a loja " + fatLoja1.getnome() );
    }

   }

   public void calcularAluguel(){
    float area = this.getArea();

    area *= 50;

    System.out.println("Seu aluguel sera de: " + area);
    


   }


}



