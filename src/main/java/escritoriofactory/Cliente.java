package escritoriofactory;

public class Cliente {

    private Documento contrato;
    private Documento procuracao;

    public Cliente (FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.procuracao = fabrica.createProcuracao();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirProcuracao() {
        return this.procuracao.emitir();
    }
}
