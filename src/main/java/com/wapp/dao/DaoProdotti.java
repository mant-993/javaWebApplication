package com.wapp.dao;



import java.util.List;

import com.wapp.bean.Prodotto;
import com.wapp.exceptions.ProdottoDaoException;

public interface DaoProdotti {
	
	public List<Prodotto> getProdotti() throws ProdottoDaoException;;
	public Prodotto getProdottoById(int id) throws ProdottoDaoException;;
	public Prodotto add(Prodotto newProduct) throws ProdottoDaoException;;
	public void update(Prodotto product) throws ProdottoDaoException;;
	public void delete(Prodotto p) throws ProdottoDaoException;;

}
