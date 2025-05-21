package br.com.AV1_POO.mensagem;

public class Foto extends Mensagem {
    private String arquivo;
    private String formato;

    public Foto(String conteudo, String arquivo, String formato) {
        super(conteudo);
        this.arquivo = arquivo;
        this.formato = formato;
    }

    @Override
    public void exibirDados() {
        System.out.println("Foto: " + getConteudo() + ", Arquivo: " + arquivo + ", Formato: " + formato + " | Enviado em: " + getDataEnvio());
    }
}
