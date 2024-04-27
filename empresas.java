import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String localizacao;
    private ArrayList<String> alimentos;
    private String tipoIndustria;
    
    // CT
    public Empresa(String nome, String localizacao, String tipoIndustria) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.alimentos = new ArrayList<>();
        this.tipoIndustria = tipoIndustria;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getLocalizacao() {
        return localizacao;
    }
    
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
       
    public String getTipoIndustria() {
        return tipoIndustria;
    }
    
    public void setTipoIndustria(String tipoIndustria) {
        this.tipoIndustria = tipoIndustria;
    }
     
    public void adicionarAlimento(String alimento) {
        alimentos.add(alimento);
    }
    
    public void removerAlimento(String alimento) {
        alimentos.remove(alimento);
    }

    public ArrayList<String> getAlimentos() {
        return alimentos;
    }
}
