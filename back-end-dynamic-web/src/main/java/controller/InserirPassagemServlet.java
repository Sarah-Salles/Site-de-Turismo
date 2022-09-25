package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CidadeDAO;
import model.Passagem;
import model.PassagemDAO;


/**
 * Servlet implementation class inserirPacoteServlet
 */
@WebServlet("/passagem-inserir")
public class InserirPassagemServlet extends HttpServlet {
	
       
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
		int id_cidade = Integer.parseInt(request.getParameter("id_cidade"));
		int desconto = Integer.parseInt(request.getParameter("desconto"));
		double valor = Double.parseDouble(request.getParameter("valor"));
		double valorPromocional = Double.parseDouble(request.getParameter("valorPromocional"));
		Date dataIda = Date.valueOf(request.getParameter("dataida"));
		Date dataVolta = Date.valueOf(request.getParameter("datavolta"));
		
		
			PassagemDAO passagemDao = new PassagemDAO();
			Passagem passagem = new Passagem();
			passagem.setDesconto(desconto);
			passagem.setId_cidade(id_cidade);
			passagem.setValor(valor);
			passagem.setValor_promocional(valorPromocional);
			passagem.setData_ida(dataIda);
			passagem.setData_volta(dataVolta);
			passagemDao.insert(passagem);
			response.sendRedirect("adminPassagem");
		
	}

}
