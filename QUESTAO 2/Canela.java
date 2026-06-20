public class Canela extends BebidaDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + " com Canela";
    }

    @Override
    public double calculaCusto() {
        return bebidaDecorada.calculaCusto() + 2.50;
    }
}