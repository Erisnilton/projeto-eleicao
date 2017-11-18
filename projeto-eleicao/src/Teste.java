import java.util.List;


public class Teste {
	
	public static void main(String[] args) {
		
		Partido psh = new Partido("partido somos honesto","PSH");
		Partido php = new Partido("partido  humanista popular","PHP");
		
		php.cadastrar(new Candidato("Erisnilton", "98098098098098", 20170104, "Senador", php, false, "CE"));
		php.cadastrar(new Candidato("Gabriel", "909078782878", 20170708, "Presidente", php, false, "CE"));
		
		List<Candidato> pessoas = php.getListaCanditado();
		
		System.out.println(pessoas);
		Partido.imprimirTodosOsCandidatos();
	}

}
