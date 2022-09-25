package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FreedomService;
import model.Passagem;
import model.PassagemDAO;



/**
 * Servlet implementation class PegarPacoteServlet
 */
@WebServlet("/adminPassagem")
public class PegarPassagemServlet extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PassagemDAO passagemDAO = new PassagemDAO();
		List<Passagem> passagens = passagemDAO.getPassagens();
		request.setAttribute("passagens", passagens);
		request.getRequestDispatcher("adminPassagem.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
