public class Eleitor extends Pessoa {
	
	private String endereco;
	private int eleitorID;
	
	public Eleitor(String nome, String cpf, String endereco, int eleitorID) {
		super(nome, cpf);
		this.endereco = endereco;
		this.eleitorID = eleitorID;
	}
	
	public int validar() {
		return 0;
	}
	

}
