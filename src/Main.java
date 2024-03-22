import java.sql.Connection;
import java.sql.SQLException;

import DAO.FilmeDAO;
import model.Filme;

public class Main {

	public static void main(String[] args) throws SQLException {
		final Connection CONNECTION = null;
		
		//CRUD Filme:
		
		//Criando funcionario
		Filme filme = new Filme();
		filme.setTitulo("Velozes e furiosos 5");
		filme.setGenero("ação");
		filme.setAnoLancamento("2011");
		
		FilmeDAO filmeDao = new FilmeDAO();
		filmeDao.criar(filme);
		
	}

}
