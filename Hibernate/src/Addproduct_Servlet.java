package Package1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Servlet implementation class productinsert
 */
public class Addproduct_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addproduct_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//int id = Integer.parseInt(request.getParameter("txtid"));
		String name = request.getParameter("txtname");
		int price = Integer.parseInt(request.getParameter("txtprice"));
		// put values in Object
		
		product prd = new product();

		//stud.setRollno(rollno);
		//prd.setid(id);
		prd.setname(name);
		prd.setprice(price);
		
		//create connection
	
		Configuration config=new Configuration();
		SessionFactory sessionFactory=config.configure().buildSessionFactory();
		
		//open connection
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//save object as record
		int i=(Integer)session.save(prd);
		session.getTransaction().commit();

		session.close();
		PrintWriter out = response.getWriter();
		if (i > 0)
			out.println("Record inserted");
		else
			out.println("Record not inserted");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
