public class Chocolate extends BebidaDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + " com Chocolate";
    }

    @Override
    public double calculaCusto() {
        return bebidaDecorada.calculaCusto() + 3.50;
    }
}