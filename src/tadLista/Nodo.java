package tadLista;

import tadFila.Paciente;

public class Nodo {
	
	protected Paciente dado;	
	protected Nodo proximo;
	
	public Nodo(Paciente dado){
		this.dado = dado;
		this.proximo = null;
	}
	
	
}
