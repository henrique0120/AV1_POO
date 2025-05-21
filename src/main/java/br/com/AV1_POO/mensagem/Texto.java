package br.com.AV1_POO.mensagem;

public class Texto extends Mensagem {
    public Texto(String conteudo) {
        super(conteudo);
    }

    @Override
    public void exibirDados() {
        System.out.println("Texto: " + getConteudo() + " | Enviado em: " + getDataEnvio());
    }
}
