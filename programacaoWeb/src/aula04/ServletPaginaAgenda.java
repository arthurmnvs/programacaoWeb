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
		PrintWriter saída = response.getWriter();
		saída.write("<HTML><BODY>");
		saída.write("Preencha o formulário: <BR>");
		Enumeration<String> nomesParametros = request.getParameterNames();
		while (nomesParametros.hasMoreElements()) {
			saída.write(request.getParameter(nomesParametros.nextElement().toString()));
			saída.write(", ");
		}
		saída.write("</BODY></HTML>");
		saída.close();
	}

}
