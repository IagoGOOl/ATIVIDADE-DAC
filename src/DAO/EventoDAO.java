package DAO;

import java.sql.Connection;
import java.util.List;

import DB.ConnectionFactory;
import model.Evento;

public class EventoDAO {
	
	private Connection connection = null;
	
	public EventoDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	
	//TODO ALL
	public List<Evento> findAll() {
		return null;
	}
	
	public void criar(Evento evento) {
		
	}
	
	public void atualizar(Evento dadoAntigo, Evento dadoNovo) {
		
	}
	
	public void apagar(Evento evento) {
		
	}
}
