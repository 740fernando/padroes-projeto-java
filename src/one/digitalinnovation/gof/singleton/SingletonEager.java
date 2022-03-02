package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado" - 	Logo no momento que a variavel estatica é definida, é atribuido a instancia
 * e automaticamente quando alguem chamar o método retornado a instancia atribuida e instanciada;
 * 
 *
 *A diferença entre o 'apressado' e o 'apressado é que :
 *
 *- O 'apressado já atribui a instancia para variavel, no momento da chamada do método
 *
 *- O 'preguiçoso' faz uma verificação antes, se for null é criado uma nova instancia.
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
