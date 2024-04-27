import java.util.ArrayList;

public class CozinhaComunitaria {
    private String nome;
    private String localizacao;
    private double capacidade;
    private List<String> alimentosDisponiveis;

    //CT
    public CozinhaComunitaria(String nome, String localizacao, double capacidade) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.alimentosDisponiveis = new ArrayList<>();
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

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    //Adicionar Alimentos
    public void adicionarAlimento(String alimento) {
        alimentosDisponiveis.add(alimento);
    }

    //Remover alimentos
    public void removerAlimento(String alimento) {
        alimentosDisponiveis.remove(alimento);
    }

    //Listar alimentos
    public List<String> listarAlimentosTransportados() {

        List<String> alimentosTransportados = new ArrayList<>();
    
        return alimentosTransportados;
    }

    //Listar alimentos disponiveis
    public List<String> getAlimentosDisponiveis() {
        return alimentosDisponiveis;
    }

    public void setAlimentosDisponiveis(List<String> alimentosDisponiveis) {
        this.alimentosDisponiveis = alimentosDisponiveis;
    }
}
