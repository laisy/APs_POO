package ufrpe.operacoes;

import ufrpe.interfaces.IOperacoes;

public class Divisao implements IOperacoes{
	
	@Override
	public int operacao(int num1, int num2) {
		int div = num1/num2;
		return div;
	}

}
