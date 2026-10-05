package escritoriofactory;

// Abstraction
public abstract class Documento {
    protected Pessoa pessoa;

    public Documento(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public abstract String emitir();
}



