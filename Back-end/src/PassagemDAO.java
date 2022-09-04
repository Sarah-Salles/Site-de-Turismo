import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PassagemDAO {

    Connection conn = null;
    PreparedStatement pstm = null;

    public void insert(Passagem passagem) {

        // Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
        // de dados

        String sql = "INSERT INTO passagem(valor,desconto,valor_promocional,data_ida,data_volta,id_cidade)" + " VALUES(?,?,?,?,?,?)";

        try {
            // Cria uma conexão com o banco
            conn = Conexao.createConnectionToMySQL();

            // Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            // Adiciona o valor do primeiro parâmetro da sql
            pstm.setDouble(1, passagem.getValor());
            // Adicionar o valor do segundo parâmetro da sql
            pstm.setInt(2, passagem.getDesconto());
            pstm.setDouble(3, passagem.getValor_promocional());
            pstm.setDate(4, new Date(passagem.getData_ida().getTime()));
            pstm.setDate(5, new Date(passagem.getData_volta().getTime()));
            pstm.setInt(6, passagem.getId_cidade());

            // Executa a sql para inserção dos dados
            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fecha as conexões
            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

    public boolean deleteById(int id) {

        String sql = "DELETE FROM passagem WHERE id = ?";
        boolean result = false;

        try {

            conn = Conexao.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);

            pstm.execute();
            result = true;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public void updateById(Passagem passagem){

        String sql = "UPDATE passagem SET valor = ?,desconto = ?,valor_promocional = ?,data_ida = ?,data_volta = ?,id_cidade WHERE id = ?";

        try {

            conn = Conexao.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);


            pstm.setDouble(1, passagem.getValor());
            // Adicionar o valor do segundo parâmetro da sql
            pstm.setInt(2, passagem.getDesconto());
            pstm.setDouble(3, passagem.getValor_promocional());
            pstm.setDate(4, new Date(passagem.getData_ida().getTime()));
            pstm.setDate(5, new Date(passagem.getData_volta().getTime()));
            pstm.setInt(6, passagem.getId_cidade());
            pstm.setInt(7, passagem.getId());

            // Executa a sql para inserção dos dados
            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fecha as conexões
            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }

    }

    public List<Passagem> getPassagens() {

        String sql = "SELECT * FROM passagem";
        ResultSet rset = null;

        List<Passagem> passagens = new ArrayList<>();
        try {
            // Cria uma conexão com o banco
            conn = Conexao.createConnectionToMySQL();

            // Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {
                Passagem passagem = new Passagem();

                passagem.setId(rset.getInt("id"));
                passagem.setValor(rset.getDouble("valor"));
                passagem.setDesconto(rset.getInt("desconto"));
                passagem.setValor_promocional(rset.getDouble("valor_promocional"));
                passagem.setData_ida(rset.getDate("data_ida"));
                passagem.setData_volta(rset.getDate("data_vola"));
                passagem.setId_cidade(rset.getInt("id_cidade"));

                passagens.add(passagem);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fecha as conexões
            try {
                if (rset != null) {
                    rset.close();
                }

                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        return passagens;
    }

    public List<Passagem> getPassagensByIdCidade(int id_cidade){
        String sql = "SELECT * FROM passagem where id_cidade = ?";
        ResultSet rset = null;

        List<Passagem> passagens = new ArrayList<>();
        try {
            // Cria uma conexão com o banco
            conn = Conexao.createConnectionToMySQL();

            // Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,id_cidade);
            rset = pstm.executeQuery();

            while (rset.next()) {
                Passagem passagem = new Passagem();

                passagem.setId(rset.getInt("id"));
                passagem.setValor(rset.getDouble("valor"));
                passagem.setDesconto(rset.getInt("desconto"));
                passagem.setValor_promocional(rset.getDouble("valor_promocional"));
                passagem.setData_ida(rset.getDate("data_ida"));
                passagem.setData_volta(rset.getDate("data_volta"));
                passagem.setId_cidade(rset.getInt("id_cidade"));

                passagens.add(passagem);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fecha as conexões
            try {
                if (rset != null) {
                    rset.close();
                }

                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        return passagens;
    }

}
