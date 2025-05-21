package br.com.AV1_POO.canal;

import br.com.AV1_POO.mensagem.Mensagem;

public class Facebook implements Canal {
    private String usuario;

    public Facebook(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void enviarMensagem(Mensagem mensagem) {
        System.out.println("[Facebook para @" + usuario + "]");
        mensagem.exibirDados();
    }
}