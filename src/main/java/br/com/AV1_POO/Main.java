package br.com.AV1_POO;

import br.com.AV1_POO.canal.*;
import br.com.AV1_POO.mensagem.*;
import org.apache.logging.log4j.message.Message;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.Scanner;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha o canal para envio:");
		System.out.println("1 - WhatsApp");
		System.out.println("2 - Telegram");
		System.out.println("3 - Facebook");
		System.out.println("4 - Instagram");
		System.out.print("Opção: ");
		int opcao = scanner.nextInt();
		scanner.nextLine();

		Canal canal = null;

		switch (opcao) {
			case 1:
				System.out.print("Digite o número de telefone: ");
				String numeroWhats = scanner.nextLine();
				canal = new WhatsApp(numeroWhats);
				break;
			case 2:
				System.out.print("Digite o número de telefone ou nome de usuário: ");
				String inputTelegram = scanner.nextLine();
				canal = new Telegram(inputTelegram);
				break;
			case 3:
				System.out.print("Digite o nome de usuário: ");
				String usuarioFb = scanner.nextLine();
				canal = new Facebook(usuarioFb);
				break;
			case 4:
				System.out.print("Digite o nome de usuário: ");
				String usuarioInsta = scanner.nextLine();
				canal = new Instagram(usuarioInsta);
				break;
			default:
				System.out.println("Opção inválida!");
				return;
		}

		System.out.println("Escolha o tipo de mensagem:");
		System.out.println("1 - Texto");
		System.out.println("2 - Foto");
		System.out.println("3 - Vídeo");
		System.out.println("4 - Arquivo");
		System.out.print("Opção: ");
		int tipoMsg = scanner.nextInt();
		scanner.nextLine();

		Mensagem mensagem = null;

		switch (tipoMsg) {
			case 1:
				System.out.print("Digite a mensagem de texto: ");
				String texto = scanner.nextLine();
				mensagem = new Texto(texto);
				break;
			case 2:
				System.out.print("Mensagem: ");
				String msgFoto = scanner.nextLine();
				System.out.print("Arquivo (nome): ");
				String arquivoFoto = scanner.nextLine();
				System.out.print("Formato (ex: jpg): ");
				String formatoFoto = scanner.nextLine();
				mensagem = new Foto(msgFoto, arquivoFoto, formatoFoto);
				break;
			case 3:
				System.out.print("Mensagem: ");
				String msgVideo = scanner.nextLine();
				System.out.print("Arquivo (nome): ");
				String arquivoVideo = scanner.nextLine();
				System.out.print("Formato (ex: mp4): ");
				String formatoVideo = scanner.nextLine();
				System.out.print("Duração (em segundos): ");
				int duracao = scanner.nextInt();
				mensagem = new Video(msgVideo, arquivoVideo, formatoVideo, duracao);
				break;
			case 4:
				System.out.print("Mensagem: ");
				String msgArq = scanner.nextLine();
				System.out.print("Arquivo (nome): ");
				String arquivo = scanner.nextLine();
				System.out.print("Formato (ex: pdf): ");
				String formato = scanner.nextLine();
				mensagem = new Arquivo(msgArq, arquivo, formato);
				break;
			default:
				System.out.println("Tipo inválido!");
				return;
		}

		canal.enviarMensagem(mensagem);
	}
}
