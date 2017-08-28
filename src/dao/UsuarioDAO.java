package dao;

import com.uaihebert.uaicriteria.UaiCriteria;
import com.uaihebert.uaicriteria.UaiCriteriaFactory;
import java.util.List;

import entidades.Usuario;

public class UsuarioDAO extends DaoGenerico<Usuario> {

    private static UsuarioDAO instance;

    public static UsuarioDAO getInstance() {
        if (instance == null) {
            instance = new UsuarioDAO();
        }

        return instance;
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> findAll() {
        return DaoGenerico.getEntityManager().createQuery("FROM " + Usuario.class.getName()).getResultList();
    }

    public Usuario buscarUsuario(String matricula, String senha) {
        Usuario result = null;

        try {
            UaiCriteria<Usuario> criteria = UaiCriteriaFactory.createQueryCriteria(DaoGenerico.getEntityManager(), Usuario.class);

            criteria.andEquals("matricula", matricula);
            criteria.andEquals("senha", senha);
            
            result = criteria.getSingleResult();
            
        } catch (Exception e) {
        }

        return result;
    }
    
    public Usuario buscarUsuarioPorMatricula(String matricula) {
        Usuario result = null;

        try {
            UaiCriteria<Usuario> criteria = UaiCriteriaFactory.createQueryCriteria(DaoGenerico.getEntityManager(), Usuario.class);

            criteria.andEquals("matricula", matricula);
                      
            result = criteria.getSingleResult();
            
        } catch (Exception e) {
        }

        return result;
    }
}
