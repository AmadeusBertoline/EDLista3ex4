package controller;

public class BinarioController {

	public String Binario(int num) {
		// Caso base: se o número for 0, retorna uma string vazia (eliminação de zeros à
		// esquerda)
		if (num == 0) {
			return "";
		}
		// Chamada recursiva: divide o número por 2 e concatena o resto da divisão (0 ou
		// 1)
		return Binario(num / 2) + (num % 2);
	}

}
