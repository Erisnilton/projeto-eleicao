
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Partido {
	private String nome;
	private String sigla;
	
	List<Candidato> listaCanditado =  new ArrayList<>();
	private static List<Partido> partidos = new ArrayList<>();
	
	public Partido(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
		this.partidos.add(Partido.this);
	}

	public void cadastrar(Candidato candidato) {
		listaCanditado.add(candidato);
	}
	
	public List<Candidato> getListaCanditado() {
		return Collections.unmodifiableList(listaCanditado);
	}
	public String getNome() {
		return nome;
	}

	public static void imprimirTodosOsCandidatos() {
		for (Partido partido : partidos) {
			System.out.println(partido);
		}
	}
	
	@Override
	public String toString() {
		return this.partidos.toString();
	}

}
