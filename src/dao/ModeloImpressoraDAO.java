package dao;

import java.util.List;

import entidades.ModeloImpressora;

public class ModeloImpressoraDAO extends DaoGenerico<ModeloImpressora> {

	private static ModeloImpressoraDAO instance;

	public static ModeloImpressoraDAO getInstance() {
		if (instance == null) {
			instance = new ModeloImpressoraDAO();
		}

		return instance;
	}

	@SuppressWarnings("unchecked")
	public List<ModeloImpressora> findAll() {
		return DaoGenerico.getEntityManager().createQuery("FROM " + ModeloImpressora.class.getName()).getResultList();
	}

}