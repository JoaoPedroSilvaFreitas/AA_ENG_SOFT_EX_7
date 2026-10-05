package escritoriofactory;

public class FabricaPJ implements FabricaAbstrata {

    public Documento createContrato() {
        return new Contrato(new PessoaJuridica());
    }


    public Documento createProcuracao() {
        return new Procuracao(new PessoaJuridica());
    }
}
