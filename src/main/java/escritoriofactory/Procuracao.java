package escritoriofactory;

public class Procuracao extends Documento {
    public Procuracao(Pessoa pessoa) {
        super(pessoa);
    }

    public String emitir() {
        return "Procuracao " + this.pessoa.getDescricao();
    }
}