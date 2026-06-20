public class Decaf implements Bebida {
    @Override
    public String getDescricao() {
        return "Café Decaf (Descafeinado)";
    }

    @Override
    public double calculaCusto() {
        return 7.00; // Preço base do Decaf
    }
}