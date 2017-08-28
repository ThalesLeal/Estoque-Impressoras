package dao;

import java.util.List;

import entidades.Setor;

public class SetorDAO extends DaoGenerico<Setor> {

	private static SetorDAO instance;

	public static SetorDAO getInstance() {
		if (instance == null) {
			instance = new SetorDAO();
		}

		return instance;
	}

    public static Object getSelectedItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static List<Setor> selectAllAuxiliar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	@SuppressWarnings("unchecked")
	public List<Setor> findAll() {
		return DaoGenerico.getEntityManager().createQuery("FROM " + Setor.class.getName()).getResultList();
	}

}