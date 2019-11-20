package ufrpe.main;

import ufrpe.interfaces.IOperacoes;
import ufrpe.operacoes.*;


public class Main {
	public static void main(String args[]) {
		
		int num1 = 8;
		int num2 = 4;
		
		System.out.println("NUM1: " + num1 + " " + "NUM2: " + num2);
		
		IOperacoes add = new Adicao();
		IOperacoes sub = new Subtracao();
		IOperacoes mul = new Multiplicacao();
		IOperacoes div = new Divisao();
		

		System.out.println("Adicao: " + add.operacao(num1, num2));
		System.out.println("Subtracao: " + sub.operacao(num1, num2));
		System.out.println("Multiplicacao: " + mul.operacao(num1, num2));
		System.out.println("Divisao: " + div.operacao(num1, num2));
		
	}
}
