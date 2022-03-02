package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado" - 	Logo no momento que a variavel estatica � definida, � atribuido a instancia
 * e automaticamente quando alguem chamar o m�todo retornado a instancia atribuida e instanciada;
 * 
 *
 *A diferen�a entre o 'apressado' e o 'apressado � que :
 *
 *- O 'apressado j� atribui a instancia para variavel, no momento da chamada do m�todo
 *
 *- O 'pregui�oso' faz uma verifica��o antes, se for null � criado uma nova instancia.
 *
 *   @author 740fernando
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
