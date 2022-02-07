

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ProductDetails() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int prdid=Integer.parseInt(request.getParameter("txtprdid"));
		String pname=request.getParameter("txtprdname");
		double price=Double.parseDouble(request.getParameter("txtprdprice"));
		
		try {
	    Connection con=DbConnection.getMyConnection();
	    String str="Insert into product(Product_ID,Product_Name,Product_Price) value(?,?,?)";
	    //String str="update product set price=? where prdid=?"; 
	    PreparedStatement ps=con.prepareStatement(str);
	    ps.setInt(1, prdid);
	    ps.setString(2, pname);
	    ps.setDouble(3, price);
	    int ans=ps.executeUpdate();
	    PrintWriter out=response.getWriter();
	    if(ans>0)
	    	out.println("Record inserted");
	    else
	    	out.println("Record not inserted");
	    con.close();
	    
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}


