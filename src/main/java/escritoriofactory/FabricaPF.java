package escritoriofactory;

public class FabricaPF implements FabricaAbstrata {

    public Documento createContrato() {
        return new Contrato(new PessoaFisica());
    }


    public Documento createProcuracao() {
        return new Procuracao(new PessoaFisica());
    }
}
