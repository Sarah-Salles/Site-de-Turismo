package controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cidade;
import model.CidadeDAO;
import model.Passagem;
import model.PassagemDAO;


@WebServlet("/cidade-editar")
public class AlterarCidadeServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.getCidadeById(id);
		request.setAttribute("cidade", cidade);
		request.getRequestDispatcher("alterarCidade.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String estado = request.getParameter("estado");
		String pais = request.getParameter("pais");
		String continente = request.getParameter("continente");
		String descricao = request.getParameter("descricao");
		
			CidadeDAO cidadeDao = new CidadeDAO();
			Cidade cidade = new Cidade();
            cidade.setId(id);
			cidade.setNome(nome);
			cidade.setEstado(estado);
			cidade.setPais(pais);
			cidade.setContinente(continente);
			cidade.setDescricao(descricao);
			cidadeDao.updateById(cidade);
			response.sendRedirect("adminCidade");
	}

}