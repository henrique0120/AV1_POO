package br.com.AV1_POO.canal;

import br.com.AV1_POO.mensagem.Mensagem;

public class Telegram implements Canal {
    private String identificador; // pode ser número ou usuário

    public Telegram(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public void enviarMensagem(Mensagem mensagem) {
        System.out.println("[Telegram para " + identificador + "]");
        mensagem.exibirDados();
    }
}
