package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DB.ConnectionFactory;
import model.Evento;

public class EventoDAO {

    private Connection connection = null;
    private PreparedStatement statement = null;


    public EventoDAO() {
        connection = new ConnectionFactory().getConnection();
    }

    //TODO ALL
    public List<Evento> findAll() throws SQLException {
        String query = "SELECT * FROM evento";
        List<Evento> eventos = new ArrayList<Evento>();

        statement = connection.prepareStatement(query);

        ResultSet resposta = statement.executeQuery();

        while (resposta.next()) {
            eventos.add(new Evento(resposta.getLong("id"), resposta.getString("nome"), resposta.getString("ano"), resposta.getString("apresentador")));
        }

        return eventos;
    }

    public void criar(Evento evento) throws SQLException{
        String query = "INSERT INTO evento (id, nome, ano apresentador) VALUES (?,?,?,?)";
        statement = connection.prepareStatement(query);

        statement.setString(1, evento.getNome());
        statement.setString(2, evento.getAno());
        statement.setString(3, evento.getApresentador());

        statement.execute();

    }

    public void atualizar(Evento dadoAntigo, Evento dadoNovo) throws SQLException {
        String query = "UPDATE evento SET nome=?, ano=?; apresentador=? WHERE id=?";
        statement = connection.prepareStatement(query);

        statement.setString(1, dadoNovo.getNome());
        statement.setString(2, dadoAntigo.getAno());
        statement.setString(3, dadoAntigo.getApresentador());

        statement.execute();

    }

    public void apagar(Evento evento) throws SQLException{
        String query = "DELETE FROM evento WHERE id=?";
        statement = connection.prepareStatement(query);

        statement.setLong(1, evento.getId());

        statement.execute();
    }
}
