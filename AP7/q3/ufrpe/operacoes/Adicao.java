package ufrpe.operacoes;

import ufrpe.interfaces.IOperacoes;

public class Adicao implements IOperacoes{
	
	@Override
	public int operacao(int num1, int num2) {
		int soma = num1 + num2;
		return soma;
	}
	


}
