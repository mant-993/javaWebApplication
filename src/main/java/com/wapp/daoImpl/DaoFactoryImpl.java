package com.wapp.daoImpl;

import com.wapp.dao.DaoFactory;
import com.wapp.dao.DaoProdotti;
import com.wapp.dao.UtenteDao;
import com.wapp.db.DbConfig;

public class DaoFactoryImpl implements DaoFactory{
	
    private DbConfig connector;
	
	public DaoFactoryImpl(DbConfig connector) {
		this.connector=connector;
	}
	
	@Override
	public DaoProdotti getDaoProdotti() {
		return new DaoProdottiImpl(connector);
	}
	
	@Override
	public UtenteDao getDaoUtente() {
		return new UtenteDaoImpl(connector);
	}

    

}
