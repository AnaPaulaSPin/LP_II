public class ShoppingCenter {
    private String name;
    private int qtd;
    private Loja lojas[];
    
    public ShoppingCenter(String nome){
        this.name = nome;
        this.qtd = 0;
        this.lojas = new Loja[10];
    }
    
    public void AdicionarLoja(Loja lojaNew){
        int n = this.getQtd();
        this.lojas[n]= lojaNew;
        this.setQtd(this.getQtd()+1);
    }
    
    public void verificarMaiorFat(){
        int n = this.getQtd(); 
        int possMaior = 0;
        float maior = 0;
        
        for(int i = 0; i < n; i++){
            if(maior < lojas[i].getFat()){
                maior = lojas[i].getFat();
                possMaior = i;
            }
        }
        System.out.println("A loja com maior faturamente e " + lojas[possMaior].getnome() + " com " + lojas[possMaior].getFat() + " de faturamente" );
    }

    public void verificarMediaAlugueis(){
        float fat = 0; int n = this.getQtd(); int qtdLojas = 0;
        
        for(int i = 0; i < n; i++){
            if(lojas[i].getAluguel() >= 1000){
                fat += lojas[i].getAluguel();
                qtdLojas++;
            }
        }
        
        if (qtdLojas > 0) {
        fat /= qtdLojas;
        System.out.println("A média de aluguéis acima de 1000 é: " + fat);
        } else {
        System.out.println("Não há lojas com aluguel acima de 1000.");
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtdLoja) {
        this.qtd = qtdLoja;
    }


    public Loja[] getLojas() {
        return lojas;
    }
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }
    
    
}
