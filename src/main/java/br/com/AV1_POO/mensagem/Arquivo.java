package br.com.AV1_POO.mensagem;

public class Arquivo extends Mensagem {
    private String arquivo;
    private String formato;

    public Arquivo(String conteudo, String arquivo, String formato) {
        super(conteudo);
        this.arquivo = arquivo;
        this.formato = formato;
    }

    @Override
    public void exibirDados() {
        System.out.println("Arquivo: " + getConteudo() + ", Arquivo: " + arquivo + ", Formato: " + formato + " | Enviado em: " + getDataEnvio());
    }
}
