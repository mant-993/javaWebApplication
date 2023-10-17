package com.wapp.servlet;

import java.io.IOException;
import java.time.LocalDate;

import com.wapp.bean.Utente;
import com.wapp.dao.DaoFactory;
import com.wapp.dao.UtenteDao;
import com.wapp.db.DbTools;
import com.wapp.exceptions.UtenteDaoException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistrazioneServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/registrazione.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DaoFactory factory = DbTools.getDaoFactory();
		UtenteDao daoUtente = factory.getDaoUtente();		
		
		Utente user = new Utente();
		
		String cognome = req.getParameter("cognome");
		user.setCognome(cognome);
		String nome = req.getParameter("nome");
		user.setNome(nome);
		String codiceFiscale = req.getParameter("codiceFiscale");
		user.setCodiceFiscale(codiceFiscale);
		String partitaIva = req.getParameter("partitaIva");
		user.setPartitaIva(partitaIva);
		String mail = req.getParameter("mail");
		user.setMail(mail);
		String indirizzo = req.getParameter("indirizzo");
		user.setIndirizzo(indirizzo);
		String cap = req.getParameter("cap");
		user.setCap(cap);
		String citta = req.getParameter("citta");
		user.setCitta(citta);
		String provincia = req.getParameter("provincia");
		user.setProvincia(provincia);
		String nazione = req.getParameter("nazione");
		user.setNazione(nazione);
		String telefono = req.getParameter("telefono");
		user.setTelefono(telefono);
		String username = req.getParameter("username");
		user.setUsername(username);
		String userPass = req.getParameter("userpass");
		user.setUserPass(userPass);
		String priv = req.getParameter("privacy");
		if(priv!=null && priv.equalsIgnoreCase("on"))
			user.setPrivacy(1);
		String redirectionPath="./home.jsp";
		try {
			daoUtente.addUtente(user);
			int idUtente = daoUtente.getByLogin(username, userPass).getIdUtente();
			req.setAttribute("user", user);
		} catch (UtenteDaoException e) {
			req.setAttribute("error", e);
			redirectionPath = "./error.jsp";
		}
		RequestDispatcher rd = req.getRequestDispatcher(redirectionPath);
		rd.forward(req, resp);

		

	}

}
