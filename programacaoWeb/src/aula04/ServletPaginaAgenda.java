package aula04;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPaginaAgenda
 */
@WebServlet("/ServletPaginaAgenda")
public class ServletPaginaAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaginaAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter sa�da = response.getWriter();
		sa�da.write("<HTML><BODY>");
		sa�da.write("Preencha o formul�rio: <BR>");
		Enumeration<String> nomesParametros = request.getParameterNames();
		while (nomesParametros.hasMoreElements()) {
			sa�da.write(request.getParameter(nomesParametros.nextElement().toString()));
			sa�da.write(", ");
		}
		sa�da.write("</BODY></HTML>");
		sa�da.close();
	}

}
