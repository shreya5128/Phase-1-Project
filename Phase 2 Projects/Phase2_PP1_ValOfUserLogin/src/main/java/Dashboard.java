

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Dashboard() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("link.html").include(request, response);  
        HttpSession session=request.getSession(false);  
        if(session!=null){  
        String email=(String)session.getAttribute("email");  
          
        out.print("Hello, "+email+" Welcome to Profile");  
        }  
        else{  
            out.print("Please login first");  
            request.getRequestDispatcher("login.html").include(request, response);
        }  
        out.close();  
	}
	}


