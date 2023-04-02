package inc.codeman.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public FirstServlet() {
		super();
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(
				"<html><head><title>First Program</title></head><body><h1>First Servlet Program</h1><p>This is my first servlet program, the journey of backend web development starts from now. Everything will be fine</p></body></html>");
		out.close();
	}

}
