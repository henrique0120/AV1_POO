package br.com.AV1_POO.canal;

import br.com.AV1_POO.mensagem.Mensagem;

public class Instagram implements Canal {
    private String usuario;

    public Instagram(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void enviarMensagem(Mensagem mensagem) {
        System.out.println("[Instagram para @" + usuario + "]");
        mensagem.exibirDados();
    }
}
