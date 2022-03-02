package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.facade.subsistema1.crm.CrmService;
import one.digitalinnovation.gof.facade.subsistema2.cep.CepApi;

// Cria uma interface mais simples para consumo das informaçoes
public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
	
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
