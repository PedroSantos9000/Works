import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }
    public Conta buscarContaPorNumero(String numeroConta) throws ContaNaoEncontradaException {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numeroConta)) {
                return conta;
            }
        }
        throw new ContaNaoEncontradaException("Conta com o número " + numeroConta + " não encontrada.");
    }

    public Conta buscarConta(Conta c) throws ContaNaoEncontradaException {
        for (Conta conta : contas) {
            if (conta.equals(c)) {
                return conta;
            }
        }
        throw new ContaNaoEncontradaException("Conta não encontrada!.");
    }

public class ContaNaoEncontradaException extends Exception {
    public ContaNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}


}
