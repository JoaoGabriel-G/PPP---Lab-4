public class Ovo extends PizzaDecorator {
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizzaDecorada.getDescricao() + ", Ovo";
    }

    @Override
    public double getCusto() {
        return pizzaDecorada.getCusto() + 2.50;
    }
}