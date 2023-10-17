package com.wapp.servlet;

import java.io.IOException;

import com.wapp.bean.Utente;
import com.wapp.dao.DaoFactory;
import com.wapp.dao.UtenteDao;
import com.wapp.db.DbTools;
import com.wapp.exceptions.UtenteDaoException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName = req.getParameter("username");
		String userPass = req.getParameter("userpass");
		
		DaoFactory factory = DbTools.getDaoFactory();
		
		UtenteDao dao = factory.getDaoUtente();
		
		try {
			Utente user = dao.getByLogin(userName, userPass);
			if(user==null) {
				req.setAttribute("error", new UtenteDaoException("Utente non riconosciuto"));
				req.getRequestDispatcher("./error.jsp").forward(req, resp);
			}else {
				HttpSession session = req.getSession();
				session.setAttribute("user", user);
				ServletContext application = req.getServletContext();
				resp.sendRedirect("./store/prodotti");
			}
		} catch (UtenteDaoException e) {
			e.printStackTrace();
		}
		

	}

}
