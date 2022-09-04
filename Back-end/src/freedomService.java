import java.util.List;

public class freedomService {
CidadeDAO cidadeDAO = new CidadeDAO();
PassagemDAO passagemDAO = new PassagemDAO();

public void buscarCidade(){
	System.out.println("_________________ LISTA DE CIDADES __________________");
    List<Cidade> lista = cidadeDAO.getCidades();
    for (Cidade c : lista) {

        System.out.println("Id: " + c.getId());
        System.out.println("Nome: " + c.getNome());
        System.out.println("Estado: " + c.getEstado());
        System.out.println("Pais: " + c.getPais());
        System.out.println("Continente: " + c.getContinente());
        System.out.println("Descrição: " + c.getDescricao());

        System.out.println("=========================");

    }
    System.out.println("_________________ FIM CIDADES __________________");
}

public void buscarPassagem(String nomeCidade) {
	int id_cidade = cidadeDAO.getByName(nomeCidade);

    System.out.println("_________________ LISTA DE PASSAGENS __________________");
    List<Passagem> lista = passagemDAO.getPassagensByIdCidade(id_cidade);
    for (Passagem p : lista) {

        String nome_cidade = cidadeDAO.getNameById(p.getId_cidade());

        System.out.println("=========================");
        System.out.println("Id: " + p.getId());
        System.out.println("Valor: " + p.getValor());
        System.out.println("Desconto: " + p.getDesconto());
        System.out.println("Valor promocional: " + p.getValor_promocional());
        System.out.println("Data de ida: " + p.getData_ida());
        System.out.println("Data de volta: " + p.getData_volta());
        System.out.println("Cidade de destino: " + nome_cidade);
        System.out.println("=========================");

    }
    System.out.println("_________________ FIM PASSAGENS __________________");
}

public void buscarPassagemNacionais() {
	 System.out.println("_________________ LISTA DE PASSAGENS NACIONAIS __________________");
     List<Cidade> cidadesNacionais = cidadeDAO.getCidadesNacionais();
     for (Cidade c : cidadesNacionais) {

         int id_nacional = c.getId();
         List<Passagem> lista = passagemDAO.getPassagensByIdCidade(id_nacional);
         for (Passagem p : lista) {

             String nome_cidade = cidadeDAO.getNameById(p.getId_cidade());

             System.out.println("=========================");
             System.out.println("Id: " + p.getId());
             System.out.println("Valor: " + p.getValor());
             System.out.println("Desconto: " + p.getDesconto());
             System.out.println("Valor promocional: " + p.getValor_promocional());
             System.out.println("Data de ida: " + p.getData_ida());
             System.out.println("Data de volta: " + p.getData_volta());
             System.out.println("Cidade de destino: " + nome_cidade);
             System.out.println("=========================");

         }

     }
     System.out.println("_________________ FIM PASSAGENS NACIONAIS __________________");
}

public void buscarPassagemInternacional() {
	System.out.println("_________________ LISTA DE PASSAGENS INTERNACIONAIS __________________");
    List<Cidade> cidadesInternacionais = cidadeDAO.getCidadesInternacionais();
    for (Cidade c : cidadesInternacionais) {

        int id_internacional = c.getId();
        List<Passagem> lista = passagemDAO.getPassagensByIdCidade(id_internacional);
        for (Passagem p : lista) {

            String nome_cidade = cidadeDAO.getNameById(p.getId_cidade());

            System.out.println("=========================");
            System.out.println("Id: " + p.getId());
            System.out.println("Valor: " + p.getValor());
            System.out.println("Desconto: " + p.getDesconto());
            System.out.println("Valor promocional: " + p.getValor_promocional());
            System.out.println("Data de ida: " + p.getData_ida());
            System.out.println("Data de volta: " + p.getData_volta());
            System.out.println("Cidade de destino: " + nome_cidade);
            System.out.println("=========================");

        }

    }
    System.out.println("_________________ FIM PASSAGENS INTERNACIONAIS __________________");
}
}
