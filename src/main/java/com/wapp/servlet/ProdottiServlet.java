package com.wapp.servlet;

import java.io.IOException;
import java.util.List;

import com.wapp.bean.Prodotto;
import com.wapp.dao.DaoFactory;
import com.wapp.dao.DaoProdotti;
import com.wapp.db.DbTools;
import com.wapp.exceptions.ProdottoDaoException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProdottiServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DaoFactory factory = DbTools.getDaoFactory();
		DaoProdotti dao = factory.getDaoProdotti();
		
		try {
			List<Prodotto> prodotti = dao.getProdotti();
			req.setAttribute("prodotti", prodotti);
			RequestDispatcher disp = req.getRequestDispatcher("/WEB-INF/jsp/prodotti.jsp");
			disp.forward(req, resp);
		} catch (ProdottoDaoException e) {
			e.printStackTrace();
		}
	}

}
