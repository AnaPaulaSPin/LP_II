public class Curso
{
    private int cod;
    private String nome;
    private int duracao;
    private float valorCurso;
    private int anoCriacao;
    
    //sets e gets
    public void setCod(int cod){
        this.cod = cod;
    }
    
    public int getCod(){
        return this.cod;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public int getDuracao(){
        return this.duracao;
    }
    
    public void setValorCurso(float valorCurso){
        this.valorCurso = valorCurso;
    }
    
    public float getValorCurso(){
        return this.valorCurso;
    }
    
    public void setAnoCriacao(int anoCriacao){
        this.anoCriacao = anoCriacao;
    }
    
    public int getAnoCriacao(){
        return this.anoCriacao;
    }
    
}
