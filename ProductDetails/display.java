
import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;



/**
* Servlet implementation class Dashboard
*/
@WebServlet("/display")
public class display extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public display() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            	// TODO Auto-generated method stub
         		HttpSession session=request.getSession(); 
         		PrintWriter out = response.getWriter();
         		String pname=request.getParameter("name");  
        		String p=request.getParameter("price"); 
        		String i=request.getParameter("id");  
        		int price = Integer.parseInt(p);
        		int id = Integer.parseInt(i);

        		ProductDetails prod = new ProductDetails();
        		prod.setPrice(price);
        		prod.setName(pname);
        		prod.setid(id);
        		
        		ArrayList<String> pd = new ArrayList<String>();
        		pd.add(i);
        		pd.add(pname);
        		pd.add(p);
        		out.println("<html><body>");
            
        		out.println(pd);
            	if (pname!=null && id!=0 && price!=0){
            		session.setAttribute("products",pd);
            		out.println("done");
            	}
            	RequestDispatcher rd = request.getRequestDispatcher("showdetails.jsp");
    			rd.forward(request, response);
            	out.println("</body></html>");

        	}

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}
