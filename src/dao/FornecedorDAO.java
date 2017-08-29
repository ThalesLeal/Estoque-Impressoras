package dao;

import java.util.List;

import entidades.Fornecedor;

public class FornecedorDAO extends DaoGenerico<Fornecedor> {

	private static FornecedorDAO instance;

	public static FornecedorDAO getInstance() {
		if (instance == null) {
			instance = new FornecedorDAO();
		}

		return instance;
	}

    public static Object getSelectedItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static List<Fornecedor> selectAllAuxiliar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	@SuppressWarnings("unchecked")
	public List<Fornecedor> findAll() {
		return DaoGenerico.getEntityManager().createQuery("FROM " + Fornecedor.class.getName()).getResultList();
	}

}