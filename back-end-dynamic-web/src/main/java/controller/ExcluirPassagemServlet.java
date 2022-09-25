package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PassagemDAO;


@WebServlet("/passagem-excluir")
public class ExcluirPassagemServlet extends HttpServlet {
	
   
    

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		PassagemDAO passagemDAO = new PassagemDAO();
		passagemDAO.deleteById(id);
		response.sendRedirect("adminPassagem.jsp");
	}

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
