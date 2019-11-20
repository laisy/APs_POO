package banco.main;

import banco.excecao.ClienteJaExisteException;
import banco.pessoa.*;

import banco.repositorio.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		RepositorioCliente c = new RepositorioCliente();
		
		try {
			c.buscarArquivo();
			System.out.println("Dados recuperados do arquivo!");
		} catch(ClassNotFoundException | IOException exception ) {
			try {
				Pessoa p1 = new PessoaFisica("Laisy", "123.121.294-26");
				c.addClientes(p1);
				Pessoa p2 = new PessoaJuridica("Vinicius", "13.347.016/0001-17");
				c.addClientes(p2);
				
			} catch(IOException exception2) {
				System.out.println("Não salvou no arquivo!");
			} catch(ClienteJaExisteException exception3) {
				System.out.println(exception3.getMessage());
			}
		} 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("DIGITE O CODIGO DO CLIENTE: ");
		String cod = s.nextLine();
		
		System.out.println(c.buscarCliente(cod));
		
		s.close();
		
		
		
	}

}
