package com.shreya.APP;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/LoginFilter")
public class LoginFilter extends HttpFilter implements Filter {
       
    
    public LoginFilter() {
        super();
        
    }

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
        String userId = request.getParameter("userid");

        if( userId != null){
                chain.doFilter(request, response);

	}
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		
		
	}

}
