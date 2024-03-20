package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DB.ConnectionFactory;
import model.Filme;

public class FilmeDAO {
	 
	private Connection connection = null;
	private PreparedStatement statement = null;
	
	public FilmeDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	
	
	public List<Filme> findAll() throws SQLException {
		String query = "SELECT * FROM filme";
		List<Filme> filmes = new ArrayList<Filme>();
		
		statement = connection.prepareStatement(query);
		
		ResultSet resposta = statement.executeQuery();
		
		while (resposta.next()) {
			filmes.add(new Filme(resposta.getInt("id"), resposta.getString("titulo"),resposta.getString("genero"),resposta.getString("anoLancamento")));
		}
		
		return filmes;
	}
	
	
	public void criar(Filme filme) throws SQLException {
		String query = "INSERT INTO filme (titulo, genero, anoLancamento) VALUES (?, ?, ?)";
		statement = connection.prepareStatement(query);
		
		statement.setString(1, filme.getTitulo());
		statement.setString(2, filme.getGenero());
		statement.setString(3, filme.getAnoLancamento());
		
		statement.execute();
		
	}
	
	//TODO update
	public void atualizar(Filme dadoAntigo, Filme dadoNovo) {
		
	}
	
	
	public void apagar(Filme filme) throws SQLException {
		String query = "DELETE FROM filme WHERE id=?";
		statement = connection.prepareStatement(query);
		
		statement.setLong(1, filme.getId());
		
		statement.execute();
		
		
	}


	
}
