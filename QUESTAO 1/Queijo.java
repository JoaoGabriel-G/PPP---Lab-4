public class Queijo extends PizzaDecorator {
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizzaDecorada.getDescricao() + ", Queijo";
    }

    @Override
    public double getCusto() {
        return pizzaDecorada.getCusto() + 4.50;
    }
}