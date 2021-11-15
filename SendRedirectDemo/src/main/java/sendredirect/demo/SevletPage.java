package sendredirect.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SevletPage")
public class SevletPage extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
	if("india".equals(userName)&& "12345".equals(password))
	{
		response.sendRedirect("home.html");
	}
	else
	{
		response.sendRedirect("Login.jsp?message=inval id");
	}
	}

}
