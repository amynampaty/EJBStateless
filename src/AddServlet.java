import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= { "/AddServlet"})


public class AddServlet extends HttpServlet {
	
	@EJB
	AddEJB obj; 
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		int i=Integer.parseInt(req.getParameter("t1"));
		int j=Integer.parseInt(req.getParameter("t2"));
		
		obj.setJ(i);
		obj.setI(j);
		obj.add();
		
		int k=obj.getK();
		
		out.println(k);
	}
	
	
}
