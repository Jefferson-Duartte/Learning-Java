public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String sistemaOperacional;
    private boolean musicaTocando;
    private boolean chamadaAtiva;
    private String paginaAtual;

    public iPhone(String modelo, String sistemaOperacional) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.musicaTocando = false;
        this.chamadaAtiva = false;
        this.paginaAtual = "";
    }

    @Override
    public void tocar() {
        if (!musicaTocando) {
            System.out.println("Reproduzindo a música.");
            musicaTocando = true;
        } else {
            System.out.println("A música já está tocando.");
        }
    }

    @Override
    public void pausar() {
        if (musicaTocando) {
            System.out.println("Pausando a música.");
            musicaTocando = false;
        } else {
            System.out.println("A música não está tocando atualmente.");
        }
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }

    @Override
    public void ligar() {
        if (!chamadaAtiva) {
            System.out.println("Ligando para um contato.");
            chamadaAtiva = true;
        } else {
            System.out.println("Já existe uma chamada sendo efetuada.");
        }
    }

    @Override
    public void atender() {
        if (!chamadaAtiva) {
            System.out.println("Atendendo uma chamada.");
            chamadaAtiva = true;
        } else {
            System.out.println("Já existe uma chamada sendo efetuada.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        paginaAtual = url;
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando uma nova aba: " + url);
    }

    @Override
    public void atualizarPagina() {
        if (!paginaAtual.isEmpty()) {
            System.out.println("Atualizando a página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página aberta para ser atualizada.");
        }
    }
}