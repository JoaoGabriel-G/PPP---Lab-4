public class Main{
    public static void main(String[] args) {

        Amplificador amp = new Amplificador();
        Luzes luz = new Luzes();
        MaquinaPipoca pipoca = new MaquinaPipoca();
        Projetor proj = new Projetor();
        PlayerStreaming player = new PlayerStreaming();
        Telao telao = new Telao();

        HomeTheaterFacade controleMestre = new HomeTheaterFacade(amp, luz, pipoca, proj, player, telao);

        controleMestre.assistirFilme("Interestelar");

        System.out.println("\n[ ... Duas horas e meia depois, o filme termina ... ]");

        controleMestre.fimDoFilme();
    }
}