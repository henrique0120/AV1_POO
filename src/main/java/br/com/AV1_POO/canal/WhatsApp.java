package br.com.AV1_POO.canal;

import br.com.AV1_POO.mensagem.Mensagem;

public class WhatsApp implements Canal {
    private String numero;

    public WhatsApp(String numero) {
        this.numero = numero;
    }

    @Override
    public void enviarMensagem(Mensagem mensagem) {
        System.out.println("[WhatsApp para " + numero + "]");
        mensagem.exibirDados();
    }
}
