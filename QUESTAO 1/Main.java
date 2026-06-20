public class Main{
    public static void main(String[] args) {

        Pizza marguerita = new Tomate(new Queijo(new MassaFinaPizza()));

        System.out.println("--- Pedido 1: Marguerita ---");
        System.out.println("Detalhes: " + marguerita.getDescricao());
        System.out.printf("Custo Total: R$ %.2f\n\n", marguerita.getCusto());

        Pizza portuguesa = new Tomate(new Ovo(new Queijo(new MassaEspessaPizza())));

        System.out.println("--- Pedido 2: Portuguesa ---");
        System.out.println("Detalhes: " + portuguesa.getDescricao());
        System.out.printf("Custo Total: R$ %.2f\n", portuguesa.getCusto());
    }
}