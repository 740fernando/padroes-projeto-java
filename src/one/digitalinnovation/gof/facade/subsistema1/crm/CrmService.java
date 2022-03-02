package one.digitalinnovation.gof.facade.subsistema1.crm;

import one.digitalinnovation.gof.facade.subsistema2.cep.CepApi;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome,String cep,String cidade,String estado) {
		System.out.println("Cliente salvo no sistema de CRM");
		System.out.println("nome : "+nome);
		System.out.println("cep : "+cep);
		System.out.println("nome : "+cidade);
		System.out.println("estado : "+estado);
	}
	
}
