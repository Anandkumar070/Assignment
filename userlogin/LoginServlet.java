package userlogin;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
    }
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter out= resp.getWriter();
		
		String username= req.getParameter("uname");
		String password= req.getParameter("pass");
		
		if(username != null && username.equals("AnandKumar") && password != null && password.equals("Anand@123")) {
          
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("uname", username);
            RequestDispatcher rd = req.getRequestDispatcher("dis");
            rd.forward(req, resp);
        }
		else {
			out.print("Username/password not matching Try again ! ");
		}
		
	}

}
