package inc.codeman.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/addServlet")
public class AdditionServlet extends GenericServlet {

	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(request.getParameter("number1")!=null && request.getParameter("number2")!=null)
		{
		Integer num1 = Integer.parseInt(request.getParameter("number1"));
		Integer num2 = Integer.parseInt(request.getParameter("number2"));
		Integer num3 = num1+num2;
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Addition-Result");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Result of computation</h1>");
		out.println("<p> The result is "+num3+"</p>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		}
	}

}
