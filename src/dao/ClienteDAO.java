package dao;

import java.util.List;

import entidades.Cliente;

public class ClienteDAO extends DaoGenerico<Cliente> {

	private static ClienteDAO instance;

	public static ClienteDAO getInstance() {
		if (instance == null) {
			instance = new ClienteDAO();
		}

		return instance;
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> findAll() {
		return DaoGenerico.getEntityManager().createQuery("FROM " + Cliente.class.getName()).getResultList();
	}

}