package banco.excecao;

public class ClienteNaoExisteException extends Exception{
	
	public ClienteNaoExisteException(String mensagem) {
		super(mensagem);
	}
	
	public ClienteNaoExisteException() {
		super("Cliente não já existe! ");
	}
}
