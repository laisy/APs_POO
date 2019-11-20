package ufrpe.operacoes;

import ufrpe.interfaces.IOperacoes;

public class Multiplicacao implements IOperacoes{
	
	@Override
	public int operacao(int num1, int num2) {
		int mult = num1 * num2;
		return mult;
	}

}
