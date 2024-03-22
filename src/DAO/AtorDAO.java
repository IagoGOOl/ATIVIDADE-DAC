package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DB.ConnectionFactory;
import model.Ator;

public class AtorDAO {
	
	private Connection connection = null;
	private PreparedStatement statement = null;
	
	public AtorDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	
	//TODO ALL
	public List<Ator> findAll() throws SQLException {
		String query ="SELECT * FROM Ator";
		List<Ator> ators = new ArrayList<Ator>();

		statement = connection.prepareStatement(query);
		
		ResultSet resposta = statement.executeQuery();

		while (resposta.next()){
			ators.add(new Ator(resposta.getInt("id"), resposta.getString("nomeArtistico"), resposta.getString("nacionalidade"), resposta.getString("nomeCompleto")));
		}
		return ators;
	}
	
	public void criar(Ator ator) throws SQLException {
		String query = "INSERT INTO ator (id, nomeArtistico, nacionalidade,nomeCompleto) VALUES (?, ?, ?)";
		statement = connection.prepareStatement(query);

		statement.setString(1, ator.getNomeArtistico());
		statement.setString(2, ator.getNacionalidade());
		statement.setString(3, ator.getNomeCompleto());

		statement.execute();
	}
	
	public void atualizar(Ator dadoAntigo, Ator dadoNovo) throws SQLException {

		String query = "UPDATE ator SET nomeArtistico=?, nacionalidade=?, nomeCompleto=? WHERE id = ?";

		statement = connection.prepareStatement(query);

		statement.setString(1, dadoNovo.getNomeArtistico());
		statement.setString(2, dadoAntigo.getNacionalidade());
		statement.setString(3, dadoAntigo.getNomeCompleto());

		statement.execute();
	}
	
	public void apagar(Ator ator) throws SQLException {
		String query = "DELETE FROM ator WHERE id=?";
		statement = connection.prepareStatement(query);

		statement.setLong(1, ator.getId());

		statement.execute();
		
	}
}