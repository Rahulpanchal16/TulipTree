

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookaseatServlet
 */
public class BookaseatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookaseatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		response.sendRedirect("class.jsp");
		
         String sname=request.getParameter("sname");
         String pname=request.getParameter("pname");
         String sage=request.getParameter("sage");
         String address=request.getParameter("address");
         String mobnum=request.getParameter("mobnum");
         String email=request.getParameter("email");
         
         try{
         	Class.forName("com.mysql.cj.jdbc.Driver");
         	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolproject","root","root");
         	PreparedStatement pst= connection.prepareStatement("insert into bookaseat values(?,?,?,?,?,?)");
         	pst.setString(1, sname);
         	pst.setString(2, pname);
         	pst.setString(3, sage);
         	pst.setString(4, address);
         	pst.setString(5, mobnum);
         	pst.setString(6, email);
         	pst.executeUpdate();
         	pst.close();
         	connection.close();
        
         }catch(Exception e){
         	e.printStackTrace();
         }
         
	}

}
