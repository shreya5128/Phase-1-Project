

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("link.html").include(request, response);  
          
        String email=request.getParameter("email");  
        String password=request.getParameter("password");  
          
        if(email.equals("aishwarya@gmail.com") && password.equals("a1234")){  
        out.print("Welcome, "+email);  
        HttpSession session=request.getSession();  
        session.setAttribute("email",email);  
        }  
        else{  
        	out.print("Incorrect email id or password");
            request.getRequestDispatcher("login.html").include(request, response);  
        }  
        out.close();
	}

}
