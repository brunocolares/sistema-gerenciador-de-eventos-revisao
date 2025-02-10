package interfaces;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.Evento;

public class GerenciadorEvento {
	
	private List<Evento> eventos = new ArrayList<>();
	
	public void criarEvento(Evento evento) {
		eventos.add(evento);
	}
	
	public List<Evento> listarEventos() {
		return eventos;
	}
	
	public List<Evento> buscarEventosPorData(String dataParaBusca) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		List<Evento> eventosPorData = new ArrayList<>();
		for(Evento evento : eventos) {
			if(simpleDateFormat.format(evento.getData()).equals(dataParaBusca)) {
				eventosPorData.add(evento);
			}
		}
		return eventosPorData;
	}
}
