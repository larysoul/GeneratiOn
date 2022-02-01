package POO44;

public class Preguica extends Animal1 {
	
	private String corPelo;

	public Preguica(String nomeAnimal, int idadeAnimal, boolean emiteSom, 
			String deslocamento, String corPelo) {
		
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		this.corPelo = corPelo;
	}
	
	public void infoPreguica() {
		System.out.print(getNomeAnimal()+" � uma pregui�a que possui "+getIdadeAnimal()+" ano(s), ");
		if(isEmiteSom()) {
			System.out.print("gruni");
		} else {
			System.out.print("n�o emite som");
		}
		System.out.println(", "+getDeslocamento()+" o tempo todo e � da cor "+corPelo);
	}
}
