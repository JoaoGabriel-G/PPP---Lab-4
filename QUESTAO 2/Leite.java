public class Leite extends BebidaDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + " com Leite";
    }

    @Override
    public double calculaCusto() {
        return bebidaDecorada.calculaCusto() + 2.00;
    }
}