package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CidadeDAO;
import model.PassagemDAO;


@WebServlet("/cidade-excluir")
public class ExcluirCidadeServlet extends HttpServlet {
	
   
    

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.deleteById(id);
		response.sendRedirect("adminCidade");
	}

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
