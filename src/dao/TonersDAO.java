package dao;

import java.util.List;

import entidades.Toners;

public class TonersDAO extends DaoGenerico<Toners> {

	private static TonersDAO instance;

	public static TonersDAO getInstance() {
		if (instance == null) {
			instance = new TonersDAO();
		}

		return instance;
	}

	@SuppressWarnings("unchecked")
	public List<Toners> findAll() {
		return DaoGenerico.getEntityManager().createQuery("FROM " + Toners.class.getName()).getResultList();
	}

}