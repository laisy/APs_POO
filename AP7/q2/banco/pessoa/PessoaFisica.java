package banco.pessoa;

public class PessoaFisica extends Pessoa{
	
	private String CPF;
	
	public PessoaFisica(String nome, String CPF) {
		super(nome);
		this.CPF = CPF;
	}

	@Override
	public String getCod() {
		return CPF;
	}

	@Override
	public String toString() {
		return "Pessoa Fisica [CPF: " + CPF + " " + super.toString() + "]";
	}
	
	
	

}
