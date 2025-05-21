package br.com.AV1_POO.mensagem;

public class Video extends Mensagem {
    private String arquivo;
    private String formato;
    private int duracao;

    public Video(String conteudo, String arquivo, String formato, int duracao) {
        super(conteudo);
        this.arquivo = arquivo;
        this.formato = formato;
        this.duracao = duracao;
    }

    @Override
    public void exibirDados() {
        System.out.println("Vídeo: " + getConteudo() + ", Arquivo: " + arquivo + ", Formato: " + formato + ", Duração: " + duracao + "s | Enviado em: " + getDataEnvio());
    }
}
