package interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.util.Scanner;

public class GerenciadorTela {
	
	private Scanner sc = new Scanner(System.in);
	private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public void exibirMenuInicial() {
		System.out.println("** SISTEMA GERENCIADOR DE EVENTOS **");
		System.out.println("[1] - Cadastrar evento");
		System.out.println("[2] - Listar eventos");
		System.out.println("[3] - Buscar eventos por data");
		System.out.println("[4] - Sair");
		System.out.print("** Digite a opção desejada: ");
		int opcaoDesejada = sc.nextInt();
		selecionarOpcaoDesejada(opcaoDesejada);
	}
	
	private void selecionarOpcaoDesejada(int opcaoDesejada) {
		switch(opcaoDesejada) {
		case 1:
			cadastrarEvento();
			break;
		case 2:
			listarEventos();
			break;
		case 3:
			buscarEventosPorData();
			break;
		case 4:
			sair();
			break;
		default:
			sair();
			break;
		}
	}
	
	private void cadastrarEvento() {
		System.out.println("* Cadastro de evento:");
		System.out.print("Digite o nome do evento: ");
		String nomeEvento = sc.nextLine();
		System.out.print("Digite a data do evento (dd/MM/yyyy): ");
		LocalDateTime dataEvento = LocalDateTime.parse(sc.nextLine(), dateTimeFormatter);
		System.out.println("Digite a categoria do evento:");
		System.out.print("[CONFERENCIA/WORKSHOP/SEMINARIO/SHOW/OUTRO: ");
		String categoriaEvento = sc.nextLine();
		System.out.println("Digite o estado do evento: ");
		String estado = sc.nextLine();
		System.out.println("Digite a cidade do evento: ");
		String cidadeEvento = sc.nextLine();
		System.out.println("Digite o endereço do evento: ");
		String enderecoEvento = sc.nextLine();
		
	}
	
	private void listarEventos() {
		
	}
	
	private void buscarEventosPorData() {
		
	}
	
	private void sair() {
		
	}
}
