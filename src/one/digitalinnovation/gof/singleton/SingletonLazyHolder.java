package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder" - Encapsula a instancia em uma classe estática interna.
 * 
 * Sua principal vantagem é que sua implementação consumo e uso de memória otimizado. THREAD SAFE
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
