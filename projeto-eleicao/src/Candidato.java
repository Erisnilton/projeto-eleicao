public class Candidato extends Pessoa {
	
	private int candidatoID;
	private String cargo;
	private Partido partido;
	private boolean resultado;
	private String uf;
	
	public Candidato(String nome, String cpf, int candidatoID, String cargo, Partido partido, boolean resultado,
			String uf) {
		super(nome, cpf);
		this.candidatoID = candidatoID;
		this.cargo = cargo;
		this.partido = partido;
		this.resultado = resultado;
		this.uf = uf;
	}
	public String getCargo() {
		return cargo;
	}
	public Partido getPartido() {
		return partido;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (getNome() + " - " + this.cargo + " - " + this.partido.getNome());
	}

}
