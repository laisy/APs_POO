package banco.pessoa;

public class PessoaJuridica extends Pessoa{
	
	private String CNPJ;

	public PessoaJuridica(String nome, String CNPJ) {
		super(nome);
		this.CNPJ = CNPJ;
	}

	@Override
	public String getCod() {
		
		return CNPJ;
	}	

	@Override
	public String toString() {
		return "Pessoa Juridica [CNPJ : " + CNPJ + " " + super.toString() + "]";
	}

}
