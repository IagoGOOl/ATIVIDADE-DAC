import java.sql.Connection;
import java.sql.SQLException;

import DAO.AtorDAO;
import DAO.FilmeDAO;
import model.Ator;
import model.Filme;

public class Main {

	public static void main(String[] args) throws SQLException {
		final Connection CONNECTION = null;
		
		//CRUD Filme:
		
		//Criando Filme
		Filme filme = new Filme();
		filme.setTitulo("socorro deus");
		filme.setGenero("ação");
		filme.setAnoLancamento("2011");
		
		FilmeDAO filmeDao = new FilmeDAO();
		filmeDao.criar(filme);
		
		
		
		// Lendo instancias de atores: 
		List<Filme> filmes = filmeDao.findAll();
		
		for (Filme f: filmes) {
			System.out.println();
			System.out.println("Id: " + f.getId());
			System.out.println("Titulo: " + f.getTitulo());
			System.out.println("Genero: " + f.getGenero());
			System.out.println("Ano de lançamento:: " + f.getAnoLancamento());
			System.out.println();
			System.out.println(f.toString());
		}
		
		
		// Atualizando instancias:
		
		Filme filmeExiste = filmeDao.findById(5L);
		
		Filme updateFilme = new Filme();
		updateFilme.setId(5L);
		updateFilme.setTitulo("Testando UPDATE");
		updateFilme.setGenero("ação");
		updateFilme.setAnoLancamento("2011");
		
		filmeDao.atualizar(updateFilme);
		
		// Deletando instancias:
		Filme filmeJaExiste= filmeDao.findById(1L);
		filmeJaExiste.setId(1L);
		filmeDao.apagar(filmeJaExiste);
		
		
		
		


		// CRUD ATOR:

		//Criando Ator

		Ator ator = new Ator();
		ator.setNomeArtistico("Paul Walker");
		ator.setNacionalidade("norte-americano");
		ator.setNomeCompleto("Paul William Walker IV");

		AtorDAO atorDAO = new AtorDAO();
		atorDAO.criar(ator);
		

		
	}

}
