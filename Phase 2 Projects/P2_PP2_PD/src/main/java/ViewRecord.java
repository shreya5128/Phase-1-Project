

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewRecord")
public class ViewRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
		    Connection con=DbConnection.getMyConnection();
		    String str="select * from product";
		    //String str="update product set price=? where prdid=?"; 
		    Statement ps=con.createStatement();
		    ResultSet ans=ps.executeQuery(str);
		    PrintWriter out=response.getWriter();
		    out.println("<table border=2>");
		    out.println("<tr><th>Produc_ID</th><th>Product_Name</th><th>Product_Price</th></tr>");
		    while(ans.next()) {
		    	out.println("<tr>");
		    	out.print("<td>"+ans.getInt("Product_ID")+"</td>");
		    	out.print("<td>"+ans.getString("Product_Name")+"</td>");
		    	out.print("<td>"+ans.getDouble("Product_Price")+"</td>");
		    	out.println("</tr>");
		    	}con.close();
		    
		    
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}


