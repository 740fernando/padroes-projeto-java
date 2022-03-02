package one.digitalinnovation.gof;

/**
 * Singleton "preguiçoso" - No primeiro momento, nao disponibiliza a instancia para o usuário
 * 
 * 
 * caracteristicas: 
 * - O construtor é privado - será instanciado através de um método
   - Ngm fora da classe pode instanciar
   
   
   @author 740fernando
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
