package com.shreya.APP;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AccountDashboard")
public class AccountDashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
    public AccountDashboard() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   response.getWriter().write("I am in Account Dashboard after passing through LoginFilter");
	}

	
	
}
