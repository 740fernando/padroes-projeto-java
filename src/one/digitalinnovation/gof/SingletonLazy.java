package one.digitalinnovation.gof;

/**
 * Singleton "pregui�oso" - No primeiro momento, nao disponibiliza a instancia para o usu�rio
 * 
 * 
 * caracteristicas: 
 * - O construtor � privado - ser� instanciado atrav�s de um m�todo
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
