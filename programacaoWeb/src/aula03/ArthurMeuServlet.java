package aula03;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArthurMeuServlet
 */
@WebServlet("/ArthurMeuServlet")
public class ArthurMeuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArthurMeuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

@Override
public void init() throws ServletException {
	super.init();
	log("ArthurMeuServlet iniciado às " + format.format(new Date()));
}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saída = response.getWriter();
		saída.write("<HTML><BODY>Olá! A data e hora doGet: ");
		saída.write(format.format(new Date()));
		saída.write("</BODY></HTML>");
		saída.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saída = response.getWriter();
		saída.write("<HTML><BODY>Olá! A data e hora doPost: ");
		saída.write(format.format(new Date()));
		saída.write("</BODY></HTML>");
		saída.close();
	}
	@Override
	public void destroy() {
		log("ArthurMeuServlet finalizado às " + format.format(new Date()));
		super.destroy();
	}

}
