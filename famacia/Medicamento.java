
public class Medicamento
{
    private String nome;
    private String principioAtivo;
    private float precoCusto;
    
    public Medicamento(String nome, String principioAtivo, float precoCusto){
        this.nome = nome;
        this.principioAtivo = principioAtivo;
        this.precoCusto = precoCusto;
    }
    
    public Medicamento(String nome, float precoCusto){
        this(nome,nome,precoCusto);
    }
    
    //sets e gets
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setPrincipioAtivo(String principioAtivo){
        this.principioAtivo = principioAtivo;
    }
    
    public String getPrincipioAtivo(){
        return this.principioAtivo;
    } 
    
    public void setPrecoCusto(float precoCusto){
        this.precoCusto = precoCusto;
    }
    
    public float getPrecoCusto(){
        return this.precoCusto;
    }
    
    //Metodos:
    public float calcularLucro(float precoVenda){
        precoVenda = precoVenda / 100;
        
        precoVenda = this.precoCusto * precoVenda;
        return precoCusto;
        
    }
    
    public float calcularLucro(){
        return this.calcularLucro(30);
        
    }
    
}
