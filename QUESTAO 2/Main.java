public class Main{
    public static void main(String[] args) {
        Bebida cafeSimples = new Expresso();

        System.out.println("Pedido: " + cafeSimples.getDescricao());
        System.out.printf("Custo: R$ %.2f\n", cafeSimples.calculaCusto());
        System.out.println("------------------------------------------------");

        Bebida decafEspecial = new Canela(new Chocolate(new Leite(new Decaf())));

        System.out.println("Pedido: " + decafEspecial.getDescricao());
        System.out.printf("Custo: R$ %.2f\n", decafEspecial.calculaCusto());
        System.out.println("------------------------------------------------");
    }
}