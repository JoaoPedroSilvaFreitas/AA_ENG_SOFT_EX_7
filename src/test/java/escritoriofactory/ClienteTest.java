package escritoriofactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {


    @Test
    void deveGarantirInstanciaUnica() {
        FabricaAbstrataFactory instancia1 = FabricaAbstrataFactory.getInstance();
        FabricaAbstrataFactory instancia2 = FabricaAbstrataFactory.getInstance();
        assertEquals(instancia1, instancia2);
    }

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = FabricaAbstrataFactory.obterFabricaAbstrata("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato PF", cliente.emitirContrato());
    }

    
    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = FabricaAbstrataFactory.obterFabricaAbstrata("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato PJ", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = FabricaAbstrataFactory.obterFabricaAbstrata("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao PF", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = FabricaAbstrataFactory.obterFabricaAbstrata("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao PJ", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirFabricaInexistente() {
        
        try {
            FabricaAbstrata fabrica = FabricaAbstrataFactory.obterFabricaAbstrata("PA");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fabrica inexistente", e.getMessage());
        }

    }

}