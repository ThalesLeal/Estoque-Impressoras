package dao;

import entidades.Impressora;
import java.util.List;


public class ImpressoraDAO extends DaoGenerico<Impressora> {

	private static ImpressoraDAO instance;

	public static ImpressoraDAO getInstance() {
		if (instance == null) {
			instance = new ImpressoraDAO();
		}

		return instance;
	}

	@SuppressWarnings("unchecked")
	public List<Impressora> findAll() {
		return DaoGenerico.getEntityManager().createQuery("FROM " + Impressora.class.getName()).getResultList();
	}

}