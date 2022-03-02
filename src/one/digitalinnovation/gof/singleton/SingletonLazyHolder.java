package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder" - Encapsula a instancia em uma classe est�tica interna.
 * 
 * Sua principal vantagem � que sua implementa��o consumo e uso de mem�ria otimizado. THREAD SAFE
 * 
 * 
 * InstanceHolder - funcao de encapsular a intancia
 * 
 * @author 740fernando
 *
 */
public class SingletonLazyHolder {
	
	
	private static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}

}
