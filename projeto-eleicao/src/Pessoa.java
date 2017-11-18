public abstract class Pessoa {
		
	private String nome;
	private String cpf;
//	private boolean pessoaJuridica;
		
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
		
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return this.nome;
	} 
		
}
