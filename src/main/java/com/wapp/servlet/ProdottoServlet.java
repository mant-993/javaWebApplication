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
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/store/prodotto")
public class ProdottoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DaoFactory factory = DbTools.getDaoFactory();
		DaoProdotti dao = factory.getDaoProdotti();
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		try {
			Prodotto prodotto = dao.getProdottoById(id);
			req.setAttribute("prodotto", prodotto);
		} catch (ProdottoDaoException e) {
			req.setAttribute("error", e);
		}
		RequestDispatcher disp = req.getRequestDispatcher("/WEB-INF/jsp/prodotto.jsp");
		disp.forward(req, resp);
		
	}

}
