package br.com.AV1_POO.mensagem;

import java.time.LocalDateTime;

public abstract class Mensagem {
    private String conteudo;
    private LocalDateTime dataEnvio;

    public Mensagem(String conteudo) {
        this.conteudo = conteudo;
        this.dataEnvio = LocalDateTime.now();
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public abstract void exibirDados();
}
