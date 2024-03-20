package DAO;

import java.sql.Connection;
import java.util.List;

import DB.ConnectionFactory;
import model.Ator;

public class AtorDAO {
	
	private Connection connection = null;
	
	public AtorDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	
	//TODO ALL
	public List<Ator> findAll() {
		return null;
	}
	
	public void criar(Ator ator) {
		
	}
	
	public void atualizar(Ator dadoAntigo, Ator dadoNovo) {
		
	}
	
	public void apagar(Ator ator) {
		
	}
}
