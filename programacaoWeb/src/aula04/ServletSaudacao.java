package aula04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSaudacao
 */
@WebServlet("/ServletSaudacao")
public class ServletSaudacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSaudacao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter sa�da = response.getWriter();
		sa�da.write("<HTML><BODY>");
		sa�da.write("Ol�, "+ request.getParameter("primeiroNome") + request.getParameter("ultimoNome") + "!");
		sa�da.write("</BODY></HTML>");
		sa�da.close();
	}

}
