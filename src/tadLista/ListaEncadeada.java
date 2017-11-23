package tadLista;

import tadFila.Paciente;

public class ListaEncadeada{
	
protected Nodo primeiro;
	
	public ListaEncadeada(){
		this.primeiro = null;	
	}
	
	
	public void removerDaPosicao(int posicao){
		if(primeiro == null){
			return;
		} else if(posicao == 0){
			primeiro = primeiro.proximo;
		} else {			
			Nodo aux = primeiro;			
			for(int i=0; i<posicao-1; i++){
				aux = aux.proximo;
			}
			
			if(aux.proximo != null){
				aux.proximo = aux.proximo.proximo;
			}
		}
	}
	
	public void imprimeTodos(){
		Nodo aux = primeiro;
		while(aux != null){
			System.out.println(aux.dado);
			aux = aux.proximo;			
		}		
	}	
	
	
//	public int pesquisaPosicao(Paciente dadoParaPesquisa){
//		int posicao = 0;
//		Nodo aux = primeiro;
//		while(aux != null){
//			if(aux.dado.equalsIgnoreCase(dadoParaPesquisa)){
//				return posicao;
//			} else {	
//				aux = aux.proximo;
//				posicao++;
//			}
//		}	
//		return -1;
//	}
	
	public void adicionaNaPosicao(Paciente dado, int posicao){		
		Nodo novoNodo = new Nodo(dado);
		if(primeiro == null || posicao == 0){
			adicionarNoComeco(dado);
			return; //finaliza o método.
		} else{	
			//opcao com for
			Nodo aux = primeiro;
			
            for (int i = 0; i < posicao - 1; i++) { 
                if(aux.proximo == null){ 
                	adicionarNoFinal(dado); 
                	return; 
                } else {
                	aux = aux.proximo; 
                }
            }
           
			if(aux.proximo != null){				
	            novoNodo.proximo = aux.proximo; 
	            aux.proximo = novoNodo;
			}
		}		
	}
	
	
	public void adicionarNoComeco(Paciente dado){
		
		Nodo novoNodo = new Nodo(dado);
		if(primeiro == null){
			primeiro = novoNodo;
		} else {
			novoNodo.proximo = primeiro;
			primeiro = novoNodo;
		}
	}
	
	
	public void adicionarNoFinal(Paciente dado){
		
		Nodo novoNodo = new Nodo(dado);
	
		if(primeiro == null){
			primeiro = novoNodo;
		} else {
			
			Nodo aux = primeiro;
			
			while(aux.proximo != null){			
				aux = aux.proximo;			
			}	
			
			aux.proximo = novoNodo;
		}
	}
	
	
	public void substituirElemento(Paciente novoDado, int posicao){		
		
		removerDaPosicao(posicao);
		
		adicionaNaPosicao(novoDado, posicao);
	}

//	public void removerPorOcorrencia(String dadoPesquisa){
//		
//		int posicao = pesquisaPosicao(dadoPesquisa);
//		
//		if(posicao != -1){
//			removerDaPosicao(posicao); 
//		}
//	}
//	
}

		
