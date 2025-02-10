package interfaces;

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
}
