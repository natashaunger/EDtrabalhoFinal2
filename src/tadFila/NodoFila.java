package tadFila;

public class NodoFila {

	protected NodoFila proximo;
	protected Paciente dado;
	
	public NodoFila(Paciente dado){
		this.dado = dado;
		this.proximo = null;
	}	

}
