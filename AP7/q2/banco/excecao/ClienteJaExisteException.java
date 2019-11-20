package banco.excecao;

public class ClienteJaExisteException extends Exception{
	
	public ClienteJaExisteException(String mensagem) {
		super(mensagem);
	}
	
	public ClienteJaExisteException() {
		super("Cliente já existe! ");
	}
}
