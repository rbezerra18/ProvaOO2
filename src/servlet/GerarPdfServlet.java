package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import objeto.GerarPdf;

/**
 * Servlet implementation class GerarPdfServlet
 */
//@WebServlet("/GerarPdfServlet")
public class GerarPdfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GerarPdfServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = (String) request.getParameter("nome");
		Double nota1 = (Double) Double.parseDouble(request.getParameter("nota1"));
		Double nota2 = (Double) Double.parseDouble(request.getParameter("nota2"));
				
		GerarPdf.geraPdf(nome,nota1,nota2);
		
		response.sendRedirect("index.jsp");
	}

}
