package dao;

import java.util.List;

import entidades.Cor;

public class CorDAO extends DaoGenerico<Cor> {

	private static CorDAO instance;

	public static CorDAO getInstance() {
		if (instance == null) {
			instance = new CorDAO();
		}

		return instance;
	}

    public static Object getSelectedItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static List<Cor> selectAllAuxiliar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	@SuppressWarnings("unchecked")
	public List<Cor> findAll() {
		return DaoGenerico.getEntityManager().createQuery("FROM " + Cor.class.getName()).getResultList();
	}

}