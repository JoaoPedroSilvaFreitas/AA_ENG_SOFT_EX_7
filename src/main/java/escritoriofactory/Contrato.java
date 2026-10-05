package escritoriofactory;

public class Contrato extends Documento {
    public Contrato(Pessoa pessoa) {
        super(pessoa);
    }

    public String emitir() {
        return "Contrato " + this.pessoa.getDescricao();
    }
}