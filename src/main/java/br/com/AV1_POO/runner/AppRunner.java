package br.com.AV1_POO.runner;

import br.com.AV1_POO.canal.*;
import br.com.AV1_POO.mensagem.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        Canal whatsapp = new WhatsApp("+551199999999");
        Canal telegram = new Telegram("usuarioTelegram");
        Canal facebook = new Facebook("usuarioFacebook");
        Canal instagram = new Instagram("usuarioInsta");

        Mensagem texto = new Texto("Olá, tudo bem?");
        Mensagem foto = new Foto("Imagem legal", "foto.jpg", "jpeg");
        Mensagem video = new Video("Vídeo tutorial", "video.mp4", "mp4", 120);
        Mensagem arquivo = new Arquivo("Relatório", "relatorio.pdf", "pdf");

        whatsapp.enviarMensagem(texto);
        telegram.enviarMensagem(video);
        facebook.enviarMensagem(foto);
        instagram.enviarMensagem(arquivo);
    }
}
