package controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CidadeDAO;
import model.Passagem;
import model.PassagemDAO;


@WebServlet("/passagem-editar")
public class AlterarPassagemServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		PassagemDAO passagemDAO = new PassagemDAO();
		Passagem passagem = passagemDAO.getPassagensById(id);
		request.setAttribute("passagem", passagem);
		request.getRequestDispatcher("alterarPassagem.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeCidade = request.getParameter("cidade");
		int desconto = Integer.parseInt(request.getParameter("desconto"));
		double valor = Double.parseDouble(request.getParameter("valor"));
		double valorPromocional = Double.parseDouble(request.getParameter("valorPromocional"));
		Date dataIda = Date.valueOf(request.getParameter("dataida"));
		Date dataVolta = Date.valueOf(request.getParameter("datavolta"));
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		CidadeDAO cidadeDao = new CidadeDAO();
		int idCidade = cidadeDao.getByName(nomeCidade);
		System.out.println(idCidade);
		if(idCidade != -1) {
			PassagemDAO passagemDao = new PassagemDAO();
			Passagem passagem = new Passagem();
			passagem.setDesconto(desconto);
			passagem.setId_cidade(idCidade);
			passagem.setValor(valor);
			passagem.setValor_promocional(valorPromocional);
			passagem.setData_ida(dataIda);
			passagem.setData_volta(dataVolta);
			passagem.setId(id);
			passagemDao.updateById(passagem);
			response.sendRedirect("adminPassagem");
		}else {
			request.setAttribute("error", idCidade);
			request.getRequestDispatcher("/alterarPassagem.jsp").forward(request, response);
		}	
	}

}
