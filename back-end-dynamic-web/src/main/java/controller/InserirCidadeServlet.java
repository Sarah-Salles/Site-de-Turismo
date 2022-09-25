package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cidade;
import model.CidadeDAO;
import model.Passagem;
import model.PassagemDAO;


/**
 * Servlet implementation class inserirPacoteServlet
 */
@WebServlet("/cidade-inserir")
public class InserirCidadeServlet extends HttpServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String estado = request.getParameter("estado");
		String pais = request.getParameter("pais");
		String continente = request.getParameter("continente");
		String descricao = request.getParameter("descricao");
		
			CidadeDAO cidadeDao = new CidadeDAO();
			Cidade cidade = new Cidade();
			cidade.setNome(nome);
			cidade.setEstado(estado);
			cidade.setPais(pais);
			cidade.setContinente(continente);
			cidade.setDescricao(descricao);
			cidadeDao.insert(cidade);
			response.sendRedirect("adminCidade");
		
	}

}
