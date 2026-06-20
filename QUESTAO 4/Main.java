public class Main{
    public static void main(String[] args) {

        Motor motor = new Motor();
        CintoDeSeguranca cinto = new CintoDeSeguranca();
        Porta porta = new Porta();
        Farol farol = new Farol();
        Radio radio = new Radio();

        Carro carro = new Carro(motor, cinto, porta, farol, radio);

        carro.ligarCarro();
        carro.desligarCarro();
    }
}