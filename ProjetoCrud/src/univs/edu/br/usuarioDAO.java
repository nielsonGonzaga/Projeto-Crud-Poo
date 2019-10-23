
package univs.edu.br;

import org.hibernate.Session;
import org.hibernate.Transaction;
import univs.edu.util.HibernateUtil;


public class usuarioDAO {
  
    private Session sessao;
    private Transaction transaction;
            
        public void salvar(usuario usuario){
            sessao =HibernateUtil.getSessionFactory().openSession();
            Transacao = sessao,beginTransaction();
            sessao.Salvar(usuario);
            transacao.commit();
            sessao.close();
                    
        }    
}
