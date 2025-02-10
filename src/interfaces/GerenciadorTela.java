package interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Evento;
import entities.EventoGratuito;
import entities.EventoPago;
import entities.Local;
import entities.enums.CategoriaEvento;

public class GerenciadorTela {
	
	private Scanner sc = new Scanner(System.in);
	private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	GerenciadorEvento gerenciadorEvento = new GerenciadorEvento();
	
	public void exibirMenuInicial() throws ParseException {
		System.out.println("** SISTEMA GERENCIADOR DE EVENTOS **");
		System.out.println("[1] - Cadastrar evento");
		System.out.println("[2] - Listar eventos");
		System.out.println("[3] - Buscar eventos por data");
		System.out.println("[4] - Sair");
		System.out.print("** Digite a opção desejada: ");
		int opcaoDesejada = sc.nextInt();
		sc.nextLine();
		selecionarOpcaoDesejada(opcaoDesejada);
	}
	
	public void exibirMenuAposOperacao() throws ParseException {
		System.out.print("Você deseja realizar outra operação[s/n]? ");
		char segundaOperacao = sc.next().charAt(0);
		sc.nextLine();
		if(segundaOperacao == 's') {
			System.out.println("Digite a opção desejada[1-4]: ");
			int opcaoDesejada = sc.nextInt();
			sc.nextLine();
			selecionarOpcaoDesejada(opcaoDesejada);
		}
		
	}
	
	private void selecionarOpcaoDesejada(int opcaoDesejada) throws ParseException {
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
	
	private void cadastrarEvento() throws ParseException {
		System.out.println("* Cadastro de evento:");
		System.out.print("Digite o nome do evento: ");
		String nomeEvento = sc.nextLine();
		System.out.print("Digite a data do evento (dd/MM/yyyy): ");
		Date dataEvento = simpleDateFormat.parse(sc.next());
		System.out.println("Digite a categoria do evento:");
		System.out.print("[CONFERENCIA/WORKSHOP/SEMINARIO/SHOW/OUTRO: ");
		CategoriaEvento categoriaEvento = CategoriaEvento.valueOf(sc.next());
		sc.nextLine();
		System.out.print("Digite o estado do evento: ");
		String estado = sc.nextLine();
		System.out.print("Digite a cidade do evento: ");
		String cidadeEvento = sc.nextLine();
		System.out.print("Digite o endereço do evento: ");
		String enderecoEvento = sc.nextLine();
		System.out.print("Digite o numero do evento: ");
		String numeroEvento = sc.nextLine();
		Local local = new Local(estado, cidadeEvento, enderecoEvento, numeroEvento);
		System.out.print("Evento gratuito ou pago(g/p)? ");
		char tipoEvento = sc.next().charAt(0);
		if(tipoEvento == 'p') {
			System.out.println("Digite o preço do evento:");
			double precoIngresso = sc.nextDouble();
			EventoPago eventoPago = new EventoPago(nomeEvento, dataEvento, local, categoriaEvento, precoIngresso);
			gerenciadorEvento.criarEvento(eventoPago);
			System.out.println("Evento pago criado!");
		} else {
			EventoGratuito eventoGratuito = new EventoGratuito(nomeEvento, dataEvento, local, categoriaEvento);
			gerenciadorEvento.criarEvento(eventoGratuito);
			System.out.println("Evento gratuito criado!");
		}
		System.out.println("");
		exibirMenuAposOperacao();

	}
	
	private void listarEventos() throws ParseException {
		List<Evento> eventos = gerenciadorEvento.listarEventos();
		if(eventos.size() > 0) {
			System.out.println("* Lista de eventos:");
			for(Evento evento : eventos) {
				System.out.println("--------------------------");
				evento.exibirDescricao();
			}
		} else {
			System.out.print("Não há nenhum evento criado");
		}
		exibirMenuAposOperacao();
	}
	
	private void buscarEventosPorData() throws ParseException {
		System.out.print("Digite a data para realizar a busca de evento(dd/MM/yyy): ");
		String dataParaBusca = sc.nextLine();
		
		List<Evento> eventos = gerenciadorEvento.buscarEventosPorData(dataParaBusca);
			if(eventos.size() > 0) {
				System.out.println("* Lista de eventos em "+dataParaBusca+": ");
				for(Evento evento : eventos) {
					System.out.println("--------------------------");
					evento.exibirDescricao();
				}
			} else {
				System.out.print("Não há nenhum evento criado em "+dataParaBusca);
			}
		exibirMenuAposOperacao();
		
	}
	
	private void sair() {
		System.out.println("Encerramento o sistema Gerenciador de Evento...");
		System.out.println("Sistema encerrado.");
	}
}
