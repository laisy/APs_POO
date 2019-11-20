package ufrpe.operacoes;

import ufrpe.interfaces.IOperacoes;

public class Subtracao implements IOperacoes{
	
	@Override
	public int operacao(int num1, int num2) {
		int subtracao = num1 - num2;
		return subtracao;
	}

}
