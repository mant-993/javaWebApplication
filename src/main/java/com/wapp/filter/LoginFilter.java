package com.wapp.filter;

import java.io.IOException;

import com.wapp.bean.Utente;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		System.out.println(req.getRequestURI());
		
		Utente user = (Utente)req.getSession().getAttribute("user");
		if(user!=null) {
			chain.doFilter(request, response);
		}else {
			String appPath = req.getContextPath();
			res.sendRedirect(appPath+"/");
		}
		
	}

}
