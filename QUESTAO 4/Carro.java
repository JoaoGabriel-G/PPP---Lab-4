public class Carro {

    private Motor motor;
    private CintoDeSeguranca  cintoDeSeguranca;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public Carro(Motor motor, CintoDeSeguranca cinto, Porta porta, Farol farol, Radio radio){
        this.motor = motor;
        this.cintoDeSeguranca =  cinto;
        this.porta = porta;
        this.farol =  farol;
        this.radio =  radio;
    }

    public void ligarCarro(){
        motor.ligar();
        cintoDeSeguranca.afivelar();
        porta.trancar();
        farol.acender();
        radio.sintonizar();
        System.out.println("Carro ligado!\n");
    }

    public void desligarCarro(){
        motor.desligar();
        cintoDeSeguranca.desafivelar();
        porta.destrancar();
        farol.desligar();
        radio.desintonizar();
        System.out.println("Carro Finalizado!\n");
    }
}
