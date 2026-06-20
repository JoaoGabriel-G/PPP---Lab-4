public class HomeTheaterFacade {
    // Referências para os componentes do subsistema
    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaPipoca pipoqueira;
    private Projetor projetor;
    private PlayerStreaming player;
    private Telao telao;

    public HomeTheaterFacade(Amplificador amp, Luzes luz, MaquinaPipoca pipoca,
                             Projetor proj, PlayerStreaming pl, Telao t) {
        this.amplificador = amp;
        this.luzes = luz;
        this.pipoqueira = pipoca;
        this.projetor = proj;
        this.player = pl;
        this.telao = t;
    }

    public void assistirFilme(String filme) {
        System.out.println("\n--- Preparando o Home Theater para o filme ---");
        pipoqueira.liga();
        pipoqueira.arrebentaPipoca();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amplificador.liga();
        amplificador.setVolume(10);
        player.liga();
        player.play(filme);
        System.out.println("--- Tudo pronto! Bom filme! ---");
    }

    public void fimDoFilme() {
        System.out.println("\n--- Desligando o Home Theater ---");
        System.out.println("Limpando as coisas e guardando o equipamento...");
        pipoqueira.desliga();
        player.desliga();
        amplificador.desliga();
        projetor.desliga();
        telao.sobe();
        luzes.liga();
        System.out.println("--- Cinema encerrado com sucesso! ---");
    }
}