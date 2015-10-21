import javax.management.Query;
import javax.persistence.EntityManager;

import br.com.Util.JpaUtil;

public class TesteConsulta {
	
	public static void main(String[] args) {
		
		EntityManager em =new JpaUtil().getEntityManager(); 
		Conta conta= new Conta();
		conta.setId(2);
		
		Query query = (Query) em.createQuery("Select m from Movimentacao where m.conta.id="+conta); 
		
		List<Movimentacao> movimentacoes = query.ge
		
	}

}
