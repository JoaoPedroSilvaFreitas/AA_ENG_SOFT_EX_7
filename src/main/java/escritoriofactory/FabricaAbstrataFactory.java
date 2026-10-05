package escritoriofactory;

public class FabricaAbstrataFactory {

    private FabricaAbstrataFactory() {};
    private static FabricaAbstrataFactory instance = new FabricaAbstrataFactory();
    public static FabricaAbstrataFactory getInstance() {
        return instance;
    }

    public static FabricaAbstrata obterFabricaAbstrata(String fabricaAbstrata) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("escritoriofactory.Fabrica" + fabricaAbstrata);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fabrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fabrica inválida");
        }
        return (FabricaAbstrata) objeto;
    }

}
