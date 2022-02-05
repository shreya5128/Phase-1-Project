

import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStream;
import java.util.Properties;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ecommerce.DBConnection;

/**
 * Servlet implementation class DemoJDBC
 */
@WebServlet("/DemoJDBC")
public class DemoJDBC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoJDBC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
           Properties props = new Properties();
           props.load(in);
           
           DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           out.println("DB Connection initialized.<br>");
           
           conn.closeConnection();
           out.println("DB Connection closed.<br>");
           
           
           out.println("</body></html>");
           conn.closeConnection();
           
   } catch (ClassNotFoundException e) {
           e.printStackTrace();
   } catch (SQLException e) {
           e.printStackTrace();

	}
	}
}
