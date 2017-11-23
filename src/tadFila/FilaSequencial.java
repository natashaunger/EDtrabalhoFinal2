package tadFila;

public class FilaSequencial {
	
private NodoFila primeiro;
	
	public FilaSequencial(){
		primeiro = null;
	}
	
	//enqueue(e): insere o elemento e no final da fila
	public void enqueue(Paciente dado) {
		NodoFila novoNodo = new NodoFila(dado);
		if(primeiro == null){
			primeiro = novoNodo;
		} else {
			NodoFila aux = primeiro;
			while(aux.proximo != null){
				aux = aux.proximo;
			}			
			aux.proximo = novoNodo;
		}	
	}	
		
	//dequeue(): remove e retorna o elemento e do in�cio da fila, e retorna null
	//se a fila estiver vazia
	public Paciente dequeue() {		
		if(primeiro == null){
			return null;
		} else {
			NodoFila aux = primeiro;
			primeiro = primeiro.proximo;
			return aux.dado;
		}
	}			
		
	//head(): retorna, mas n�o remove, o primeiro elemento da fila, 
	//e retorna null se a fila estiver vazia
	public Paciente head() {
		if(primeiro == null) { return null; }
		else {
			return primeiro.dado;
		}
	}
	
		
	//size(): retorna o n�mero de elementos da fila
	public int size() {
		int conta = 0;
		NodoFila aux = primeiro;
		while(aux != null){
			conta++;
			aux = aux.proximo;
		}
		return conta;
	}
		
	//isEmpty(): retorna true se a fila estiver vazia, e false caso contr�rio
	public boolean isEmpty() {
		if(primeiro == null) { return true; }
		else { return false; }		
	}
		
	//clear(): esvazia a fila
	public void clear() {
		while(!isEmpty()) {
			dequeue();
		}
	}	


}
