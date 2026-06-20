public class Tomate extends PizzaDecorator {
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizzaDecorada.getDescricao() + ", Tomate";
    }

    @Override
    public double getCusto() {
        return pizzaDecorada.getCusto() + 3.00;
    }
}