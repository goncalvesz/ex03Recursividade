package controller;
/*
 * 3. Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterior
 */
public class RecursividadeController {
	
	public RecursividadeController(){
		
	}
	
	public int Fatorial(int x){
		if (x > 0) {
			return (x * Fatorial(x-1));
		}
		else {
			return 1; //Returna 1 quando x == 0; assim o fatorial de 0 será exibido como 1 e todas as multiplicacoes serao feitas como solicitado
		}
	}

}
