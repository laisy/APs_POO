package banco.repositorio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import banco.excecao.*;
import banco.pessoa.Pessoa;

public class RepositorioCliente {
	
	ArrayList <Pessoa> clientes;
	
	public RepositorioCliente() {
		clientes = new ArrayList<Pessoa>();
	}
	
	public void salvarArquivo() throws IOException {
		FileOutputStream file = new FileOutputStream("cliente.dat");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(clientes);
		os.close();
	}
	
	public void buscarArquivo() throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("cliente.dat");
		ObjectInputStream is = new ObjectInputStream(file);
		
		clientes = (ArrayList<Pessoa>) is.readObject();
		is.close();
	}
	
	public void addClientes(Pessoa p) throws IOException, ClienteJaExisteException {
		if(buscarCliente(p.getCod()) != null) {
			throw new ClienteJaExisteException();
		} 
		clientes.add(p);
		salvarArquivo();
	}
	
	public Pessoa buscarCliente(String cod) {
		for(int i=0; i<clientes.size(); i++ ) {
			if(clientes.get(i).getCod().equals(cod)) {
				return clientes.get(i);	
			}
		}
		return null;
	}
	
	public void removerCliente(String cod) throws ClienteNaoExisteException, IOException {
		Pessoa cliente = buscarCliente(cod);
		if(cliente == null) {
			throw new ClienteNaoExisteException();
		} 
		clientes.remove(cliente);
		salvarArquivo();
	}
	
	public void alterarCliente(Pessoa pessoa) throws ClienteNaoExisteException, IOException {
		Pessoa cliente = buscarCliente(pessoa.getCod());
		if(cliente == null) {
			throw new ClienteNaoExisteException();
		} 
		cliente.setNome(pessoa.getNome());
		salvarArquivo();
	}
	

}
